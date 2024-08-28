package net.csonic.customers.graphql.component;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.InputArgument;
import net.csonic.customers.graphql.DgsConstants;
import net.csonic.customers.graphql.GraphqlBeanMapper;
import net.csonic.customers.graphql.datasource.entity.RelationsEntity;
import net.csonic.customers.graphql.service.query.RelationsQueryService;
import net.csonic.customers.graphql.types.RelationsSearchFilter;
import net.csonic.customers.graphql.types.ThirdPartyRelationships;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

@DgsComponent
public class RelationsDataResolver {

    private final GraphqlBeanMapper graphqlBeanMapper;

    @Autowired
    public RelationsDataResolver(GraphqlBeanMapper graphqlBeanMapper) {
        this.graphqlBeanMapper = graphqlBeanMapper;
    }

    @Autowired
    private RelationsQueryService queryService;

    @DgsData(parentType = DgsConstants.QUERY_TYPE, field = DgsConstants.QUERY.RelationsSearch)
    public List<ThirdPartyRelationships> findDirec(@InputArgument(name = DgsConstants.QUERY.DIRECSEARCH_INPUT_ARGUMENT.Filter) RelationsSearchFilter filter) {
        List<RelationsEntity> relationsEntities = queryService.findById(filter.getCic());
        return relationsEntities.stream()
                .map(graphqlBeanMapper::mapToGraphql)
                .collect(Collectors.toList());
    }
}
