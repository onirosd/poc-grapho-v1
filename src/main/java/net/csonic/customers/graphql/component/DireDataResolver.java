package net.csonic.customers.graphql.component;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.InputArgument;
import net.csonic.customers.graphql.DgsConstants;
import net.csonic.customers.graphql.GraphqlBeanMapper;
import net.csonic.customers.graphql.datasource.entity.DireEntity;
import net.csonic.customers.graphql.service.query.DireQueryService;
import net.csonic.customers.graphql.types.Dire;
import net.csonic.customers.graphql.types.DirecSearchFilter;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

@DgsComponent
public class DireDataResolver {

    private final GraphqlBeanMapper graphqlBeanMapper;

    @Autowired
    private DireQueryService queryService;

    @Autowired
    public DireDataResolver(GraphqlBeanMapper graphqlBeanMapper) {
        this.graphqlBeanMapper = graphqlBeanMapper;
    }

    @DgsData(parentType = DgsConstants.QUERY_TYPE, field = DgsConstants.QUERY.DirecSearch)
    public List<Dire> findDirec(@InputArgument(name = DgsConstants.QUERY.DIRECSEARCH_INPUT_ARGUMENT.Filter) DirecSearchFilter filter) {
        List<DireEntity> direEntities = queryService.findDirexCicxType(filter.getCic(), filter.getType());
        return direEntities.stream()
                .map(graphqlBeanMapper::mapToGraphql)
                .collect(Collectors.toList());
    }
}
