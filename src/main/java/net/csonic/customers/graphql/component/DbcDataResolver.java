package net.csonic.customers.graphql.component;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.DgsDataFetchingEnvironment;
import com.netflix.graphql.dgs.InputArgument;
import graphql.GraphQLContext;
import net.csonic.customers.graphql.DgsConstants;
import net.csonic.customers.graphql.GraphqlBeanMapper;
import net.csonic.customers.graphql.datasource.entity.CorreoEntity;
import net.csonic.customers.graphql.datasource.entity.DbcEntity;
import net.csonic.customers.graphql.datasource.entity.DceEntity;
import net.csonic.customers.graphql.datasource.entity.DcpEntity;
import net.csonic.customers.graphql.datasource.entity.DireEntity;
import net.csonic.customers.graphql.datasource.entity.RelationsEntity;
import net.csonic.customers.graphql.datasource.entity.TelefonoEntity;
import net.csonic.customers.graphql.service.query.*;
import net.csonic.customers.graphql.types.*;
import net.csonic.customers.graphql.utils.AppConstants;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@DgsComponent
public class DbcDataResolver {

    private final GraphqlBeanMapper graphqlBeanMapper;

    @Autowired
    public DbcDataResolver(GraphqlBeanMapper graphqlBeanMapper) {
        this.graphqlBeanMapper = graphqlBeanMapper;
    }
    @Autowired
    private DbcQueryService queryService;
    @Autowired
    private DcpQueryService queryService2;
    @Autowired
    private DceQueryService queryService3;
    @Autowired
    private CorreoQueryService queryService4;
    @Autowired
    private TelefonoQueryService queryService5;
    @Autowired
    private RelationsQueryService queryService6;
    @Autowired
    private DireQueryService queryService7;

    @DgsData(parentType = DgsConstants.QUERY_TYPE, field = DgsConstants.QUERY.DbcSearchCicPersonpn)
    public CustomerPn findDbcByIdandPersonIdPN(@InputArgument(name = DgsConstants.QUERY.DBCSEARCHCICPERSONPN_INPUT_ARGUMENT.Filter) PersonPnSearchFilter filter, DgsDataFetchingEnvironment dfe) {
            
        String Cic      = StringUtils.isNotEmpty(filter.getCic()) ? filter.getCic() : null;
        String PersonId = StringUtils.isNotEmpty(filter.getPersonId()) ? filter.getPersonId() : null;
        String CustomerType = (filter.getCustomerType() != null && StringUtils.isNotEmpty(filter.getCustomerType().getCode()))
                ? filter.getCustomerType().getCode()
                : null;
        String DirectionType = (filter.getDirectionType() != null && StringUtils.isNotEmpty(filter.getDirectionType().getCode()))
                ? filter.getDirectionType().getCode()
                : null;

        String firstName = (filter.getFirstName() != null && StringUtils.isNotEmpty(filter.getFirstName()))
        ? filter.getFirstName()
        : null;

        String secondName = (filter.getSecondName() != null && StringUtils.isNotEmpty(filter.getSecondName()))
        ? filter.getSecondName()
        : null;

        String fatherLastName = (filter.getFatherLastName() != null && StringUtils.isNotEmpty(filter.getFatherLastName()))
        ? filter.getFatherLastName()
        : null;

        String motherLastName = (filter.getMotherLastName() != null && StringUtils.isNotEmpty(filter.getMotherLastName()))
        ? filter.getMotherLastName()
        : null;

        String birthDate= (filter.getBirthDate() != null && StringUtils.isNotEmpty(filter.getBirthDate()))
        ? filter.getBirthDate()
        : null;

        String birthPlace= (filter.getBirthPlace() != null && StringUtils.isNotEmpty(filter.getBirthPlace()))
        ? filter.getBirthPlace()
        : null;



        if (CustomerType != null && !AppConstants.VALID_CUSTOMER_TYPES.contains(CustomerType)) {
            throw new IllegalArgumentException("Customer Type Invalido: " + CustomerType);
        }

        if (DirectionType != null) {
            GraphQLContext context = dfe.getGraphQlContext();
            context.put("directionType", DirectionType);
        }

        Map<String, Object> entities = queryService.findDbcDceDcpByCicAndPersonIdAndCustomerType(Cic, PersonId, CustomerType, firstName, secondName, fatherLastName, motherLastName, birthDate , birthPlace);
        DbcEntity dbcEntity = (DbcEntity) entities.get("dbc");
        DceEntity dceEntity = (DceEntity) entities.get("dce");
        DcpEntity dcpEntity = (DcpEntity) entities.get("dcp");

        return graphqlBeanMapper.mapToGraphqlCustomerPn(dbcEntity, dceEntity, dcpEntity);
    }

    @DgsData(parentType = DgsConstants.CUSTOMERPN.TYPE_NAME, field = DgsConstants.CUSTOMERPN.Directions)
    public List<Dire> findDirectionsByIdPn(DgsDataFetchingEnvironment dfe) {

        GraphQLContext context = dfe.getGraphQlContext();
        String directionType = context.getOrDefault("directionType", null);

        CustomerPn dbc = dfe.getSource();
        List<DireEntity> direEntities = queryService7.findDirexCicxType(dbc.getCic(), directionType);
        return direEntities.stream()
                .map(graphqlBeanMapper::mapToGraphql)
                .collect(Collectors.toList());
    }

    @DgsData(parentType = DgsConstants.CUSTOMERPN.TYPE_NAME, field = DgsConstants.CUSTOMERPN.Emails)
    public List<Emails> findEmailsByCorreoKeyIdbcPn(DgsDataFetchingEnvironment dfe) {
        CustomerPn dbc = dfe.getSource();
        List<CorreoEntity> correoEntities = queryService4.findByCorreoKeyIdbcPriority(dbc.getCic());
        return correoEntities.stream()
                .map(graphqlBeanMapper::mapToGraphql)
                .collect(Collectors.toList());
    }

    @DgsData(parentType = DgsConstants.CUSTOMERPN.TYPE_NAME, field = DgsConstants.CUSTOMERPN.Phones)
    public List<Phones> findPhonesByIdPn(DgsDataFetchingEnvironment dfe) {
        CustomerPn dbc = dfe.getSource();
        List<TelefonoEntity> telefonoEntities = queryService5.findByIdPriority(dbc.getCic());
        return telefonoEntities.stream()
                .map(graphqlBeanMapper::mapToGraphql)
                .collect(Collectors.toList());
    }

    @DgsData(parentType = DgsConstants.CUSTOMERPN.TYPE_NAME, field = DgsConstants.CUSTOMERPN.Relations)
    public List<ThirdPartyRelationships> findRelationsByIdPn(DgsDataFetchingEnvironment dfe) {
        CustomerPn dbc = dfe.getSource();
        List<RelationsEntity> relationsEntities = queryService6.findById(dbc.getCic());
        return relationsEntities.stream()
                .map(graphqlBeanMapper::mapToGraphql)
                .collect(Collectors.toList());
    }

    @DgsData(parentType = DgsConstants.QUERY_TYPE, field = DgsConstants.QUERY.DbcSearchCicPersonpj)
    public CustomerPj findDbcByIdandPersonIdPJ(@InputArgument(name = DgsConstants.QUERY.DBCSEARCHCICPERSONPJ_INPUT_ARGUMENT.Filter) PersonPjSearchFilter filter, DgsDataFetchingEnvironment dfe) {

        String Cic = StringUtils.isNotEmpty(filter.getCic()) ? filter.getCic() : null;
        String PersonId = StringUtils.isNotEmpty(filter.getPersonId()) ? filter.getPersonId() : null;
        String CustomerType = (filter.getCustomerType() != null && StringUtils.isNotEmpty(filter.getCustomerType().getCode()))
                ? filter.getCustomerType().getCode()
                : null;
        String DirectionType = (filter.getDirectionType() != null && StringUtils.isNotEmpty(filter.getDirectionType().getCode()))
                ? filter.getDirectionType().getCode()
                : null;
        String FullName = (filter.getFullName() != null && StringUtils.isNotEmpty(filter.getFullName()))
                ? filter.getFullName()
                : null;

        if (DirectionType != null) {
            GraphQLContext context = dfe.getGraphQlContext();
            context.put("directionType", DirectionType);
        }

        Map<String, Object> entities = queryService.findDbcDceDcpByCicAndPersonIdAndCustomerTypePj(Cic, PersonId, CustomerType, FullName);
        DbcEntity dbcEntity = (DbcEntity) entities.get("dbc");
        DceEntity dceEntity = (DceEntity) entities.get("dce");
        DcpEntity dcpEntity = (DcpEntity) entities.get("dcp");

        return graphqlBeanMapper.mapToGraphqlCustomerPj(dbcEntity, dceEntity, dcpEntity);
    }

    @DgsData(parentType = DgsConstants.CUSTOMERPJ.TYPE_NAME, field = DgsConstants.CUSTOMERPJ.Directions)
    public List<Dire> findDirectionsByIdPj(DgsDataFetchingEnvironment dfe) {

        GraphQLContext context = dfe.getGraphQlContext();
        String directionType = context.getOrDefault("directionType", null);

        CustomerPj dbc = dfe.getSource();
        List<DireEntity> direEntities = queryService7.findDirexCicxType(dbc.getCic(), directionType);
        return direEntities.stream()
                .map(graphqlBeanMapper::mapToGraphql)
                .collect(Collectors.toList());
    }

    @DgsData(parentType = DgsConstants.CUSTOMERPJ.TYPE_NAME, field = DgsConstants.CUSTOMERPJ.Emails)
    public List<Emails> findEmailsByCorreoKeyIdbcPj(DgsDataFetchingEnvironment dfe) {
        CustomerPj dbc = dfe.getSource();
        List<CorreoEntity> correoEntities = queryService4.findByCorreoKeyIdbcPriority(dbc.getCic());
        return correoEntities.stream()
                .map(graphqlBeanMapper::mapToGraphql)
                .collect(Collectors.toList());
    }

    @DgsData(parentType = DgsConstants.CUSTOMERPJ.TYPE_NAME, field = DgsConstants.CUSTOMERPJ.Phones)
    public List<Phones> findPhonesByIdPj(DgsDataFetchingEnvironment dfe) {
        CustomerPj dbc = dfe.getSource();
        List<TelefonoEntity> telefonoEntities = queryService5.findByIdPriority(dbc.getCic());
        return telefonoEntities.stream()
                .map(graphqlBeanMapper::mapToGraphql)
                .collect(Collectors.toList());
    }

    @DgsData(parentType = DgsConstants.CUSTOMERPJ.TYPE_NAME, field = DgsConstants.CUSTOMERPJ.Relations)
    public List<ThirdPartyRelationships> findRelationsByIdPj(DgsDataFetchingEnvironment dfe) {
        CustomerPj dbc = dfe.getSource();
        List<RelationsEntity> relationsEntities = queryService6.findById(dbc.getCic());
        return relationsEntities.stream()
                .map(graphqlBeanMapper::mapToGraphql)
                .collect(Collectors.toList());
    }
}
