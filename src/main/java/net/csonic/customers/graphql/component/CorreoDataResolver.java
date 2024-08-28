package net.csonic.customers.graphql.component;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.InputArgument;
import net.csonic.customers.graphql.DgsConstants;
import net.csonic.customers.graphql.GraphqlBeanMapper;
import net.csonic.customers.graphql.service.query.CorreoQueryService;
import net.csonic.customers.graphql.types.Emails;
import net.csonic.customers.graphql.types.EmailsSearchFilter;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

@DgsComponent
public class CorreoDataResolver {
    
    private final GraphqlBeanMapper graphqlBeanMapper;
     
    @Autowired
    private CorreoQueryService queryService;
    @Autowired
    public CorreoDataResolver(GraphqlBeanMapper graphqlBeanMapper) {
        this.graphqlBeanMapper = graphqlBeanMapper;
    }


    @DgsData(parentType = DgsConstants.QUERY_TYPE, field = DgsConstants.QUERY.EmailsSearch)
    public List<Emails> findDirec(@InputArgument(name = DgsConstants.QUERY.DIRECSEARCH_INPUT_ARGUMENT.Filter) EmailsSearchFilter filter) {

        return queryService.findByCorreoKeyIdbc(filter.getCic())
               .stream().map(graphqlBeanMapper::mapToGraphql)
               .collect(Collectors.toList());

        // .map(dbEntity -> {
        //     return GraphqlBeanMapper.mapToGraphql(dbEntity);
        // });
         
    }

}
