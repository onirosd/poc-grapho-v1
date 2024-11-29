package net.csonic.customers.graphql.component;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.InputArgument;
import net.csonic.customers.graphql.DgsConstants;
import net.csonic.customers.graphql.GraphqlBeanMapper;
import net.csonic.customers.graphql.datasource.entity.DtcEntity;
import net.csonic.customers.graphql.service.query.DtcQueryService;
import net.csonic.customers.graphql.types.Phones;
import net.csonic.customers.graphql.types.TelefoneSearchFilter;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

@DgsComponent
public class DtcDataResolver {

    private final GraphqlBeanMapper graphqlBeanMapper;

    @Autowired
    public DtcDataResolver(GraphqlBeanMapper graphqlBeanMapper) {
        this.graphqlBeanMapper = graphqlBeanMapper;
    }

    @Autowired
    private DtcQueryService queryService;

    @DgsData(parentType = DgsConstants.QUERY_TYPE, field = DgsConstants.QUERY.TelefonoSearch)
    public List<Phones> findDirec(@InputArgument(name = DgsConstants.QUERY.DIRECSEARCH_INPUT_ARGUMENT.Filter) TelefoneSearchFilter filter) {
        List<DtcEntity> telefonoEntities = queryService.findById(filter.getCic());
        return telefonoEntities.stream()
                .map(graphqlBeanMapper::mapToGraphql)
                .collect(Collectors.toList());
    }
}
