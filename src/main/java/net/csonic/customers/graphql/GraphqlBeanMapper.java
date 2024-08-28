package net.csonic.customers.graphql;

import net.csonic.customers.graphql.datasource.entity.CorreoEntity;
import net.csonic.customers.graphql.datasource.entity.DbcEntity;
import net.csonic.customers.graphql.datasource.entity.DceEntity;
import net.csonic.customers.graphql.datasource.entity.DcpEntity;
import net.csonic.customers.graphql.datasource.entity.DireEntity;
import net.csonic.customers.graphql.datasource.entity.RelationsEntity;
import net.csonic.customers.graphql.datasource.entity.TelefonoEntity;
import net.csonic.customers.graphql.types.*;
import org.ocpsoft.prettytime.PrettyTime;
import net.csonic.customers.graphql.utils.DateUtils;
import org.springframework.stereotype.Component;

import java.time.ZoneOffset;
import java.util.Locale.Category;

@Component
public class GraphqlBeanMapper {

    private static final PrettyTime PRETTY_TIME = new PrettyTime();
    private static final ZoneOffset ZONE_OFFSET = ZoneOffset.ofHours(5);
    
    public Emails mapToGraphql(CorreoEntity correoEntity) {
        return Emails.newBuilder()
               .email(correoEntity.getCorreo())
               .emailState(EmailState.newBuilder().code(correoEntity.getCorreoEstado()).build())
               .emailType(EmailType.newBuilder().code(correoEntity.getTipoCorreoId()).build())
               .build();
    }

    public Dire mapToGraphql(DireEntity direEntity) {
       return Dire.newBuilder()
              .type(Type.newBuilder().code(direEntity.getDireMscTdir()).build())
              .status(Status.newBuilder().code(direEntity.getDireMscSdir()).build())
              .street(
                     Street.newBuilder()
                     .code(direEntity.getDireCodTvia())
                     .name(direEntity.getDireMscBvia())
                     .number(direEntity.getDireNumeracion())
                     .build()
              )
              .building(
                     Building.newBuilder()
                     .code(direEntity.getDireMscDpir())
                     .number(direEntity.getDireNumDpir())
                     .build()
              )
              .blockCode(direEntity.getDireMscMnza())
              .lotNumber(direEntity.getDireMscLote())
              .urbanization(
                     Urbanization.newBuilder()
                     .code(direEntity.getDireCodTchb())
                     .name(direEntity.getDireMscCjhb())
                     .build()
              )
              .zone(
                     Zone.newBuilder()
                     .code(direEntity.getDireCodSezn())
                     .name(direEntity.getDireMscSezn())
                     .build()
                    )
              .reference(direEntity.getDireGlsRefe())
              .geolocation(Geolocation.newBuilder().equivalentCode(direEntity.getDireCodLuga()).build())
              .summary(direEntity.getDireGlsDire())
              .build();
    }

    public ThirdPartyRelationships mapToGraphql(RelationsEntity relationsEntity) {
        return ThirdPartyRelationships.newBuilder()
                .type(Type.newBuilder().code(relationsEntity.getRecCodTrec()).build())
                .subType(SubType2.newBuilder().code(relationsEntity.getRecCodArec()).build())
                .relatedPerson(RelatedPerson.newBuilder().cic(relationsEntity.getRecCicIrel()).build())
                .validityDateRange(
                    validityDateRange2.newBuilder() 
                    .from(DateUtils.addHyphensToDateString(relationsEntity.getRecFecFini()))
                    .to(DateUtils.addHyphensToDateString(relationsEntity.getRecFecFter()))
                    .build()
                )
                .shareHolderParticipation(
                    ShareHolderParticipation.newBuilder()
                    .valueAssociated(relationsEntity.getRecCodArec())
                    .valueCodeAssociated(relationsEntity.getRecSgvArec())
                    .registerDate(DateUtils.addHyphensToDateString(relationsEntity.getRecFecFval()))
                    .verificationDate(DateUtils.addHyphensToDateString(relationsEntity.getRecFecFvrf()))
                    .build()
                )
                .build();
    }

    public Phones mapToGraphql(TelefonoEntity telefonoEntity) {
        return Phones.newBuilder()
               .phoneNumber(telefonoEntity.getTelefonoNumero())
               .phoneType(PhoneType.newBuilder().code(telefonoEntity.getTipoTelefonoId()).build())
               .phoneState(PhoneState.newBuilder().code(telefonoEntity.getTelefonoEstado()).build())
               .phoneClasification(PhoneClasification.newBuilder().code(telefonoEntity.getTelefonoClasificacionId()).build())
               .phoneAnexo(PhoneAnexo.newBuilder().code(telefonoEntity.getTelefonoAnexo()).build())
               .phonePais(PhonePais.newBuilder().code(telefonoEntity.getTelefonoCodPais()).build())
               .phoneArea(PhoneArea.newBuilder().code(telefonoEntity.getTelefonoCodArea()).build())
               .build();
    }

    public CustomerPn mapToGraphqlCustomerPn(DbcEntity dbcEntity, DceEntity dceEntity, DcpEntity dcpEntity) {
        if (dbcEntity.getDbcNumDamp() == null) {
            throw new IllegalArgumentException("Esta búsqueda no está permitida en esta API, aquí solo consultas personas naturales.");
        }

        return CustomerPn.newBuilder()
            .cic(dbcEntity.getDbcKeyIreg())
            .personId(dbcEntity.getDbcIdcIcli())
            .customerType(CustomerType.newBuilder().code(dbcEntity.getDbcCodTicl()).build())
            .natural(
                Dbc2pn.newBuilder()
                .document(Document.newBuilder().dniDigitVerify(dbcEntity.getDbcCodVdni()).foreignFullDocument(dbcEntity.getDbcNumDamp()).build())
                .firstName(dbcEntity.getDbcGlsNomPrimer())
                .secondName(dbcEntity.getDbcGlsNomSegundo())
                .fatherLastName(dbcEntity.getDbcGlsApat())
                .motherLastName(dbcEntity.getDbcGlsAmat())
                .demographicInformation(
                    DemographicInformation.newBuilder()
                        .birthDate(DateUtils.addHyphensToDateString(dcpEntity.getDcpFecFnac()))
                        .birthPlace(BirthPlace.newBuilder().code(dcpEntity.getDcpLugNaci()).build())
                        .gender(Gender.newBuilder().code(dcpEntity.getDcpIndSexo()).build())
                        .nationality(Nationality.newBuilder().code(dcpEntity.getDcpCodPnac()).build())
                        .isResident("1".equals(dbcEntity.getDbcIndResi()))
                        .maritalStatus(MaritalStatus.newBuilder().code(dcpEntity.getDcpIndEciv()).build())
                        .housingType(HousingType.newBuilder().code(dcpEntity.getDcpIndCasa()).build())
                        .situation(Situation.newBuilder().code(dcpEntity.getDcpIndSlab()).build())
                        .instruction(
                            Instruction.newBuilder()
                               .instructionDegree(InstructionDegree.newBuilder().code(dcpEntity.getDcpIndNedu()).build())
                               .profession(Profession.newBuilder().code(dcpEntity.getDcpCodProf()).build())
                            .build()
                        )
                        .economicActivity(EconomicActivity.newBuilder()
                        .primary(EconomicActivityType.newBuilder().code(dbcEntity.getDbcCodActi()).build())
                        .secondary(EconomicActivityType.newBuilder().code(dcpEntity.getDcpCodActs()).build())
                        .build()
                        )
                        .hasOwnBusiness("1".equals(dcpEntity.getDcpIndUcta()))
                        .ownBusinessInformation(
                            OwnBusinessInformation.newBuilder()
                            .legalName(null)
                            .ruc(null)
                            .sunarpReferenceId(null)
                            .build()
                        )
                        .socioeconomicStatus(SocioeconomicStatus.newBuilder().code(null).build())
                    .build()
                )
                .internalInformation(
                    InternalInformation.newBuilder()
                    .bankRelationship(BankRelationship0.newBuilder().code(dbcEntity.getDbcCodTicl()).build())
                    .politicallyExposed(
                        PoliticallyExposed0.newBuilder()
                        .relationType(RelationType0.newBuilder().code(dcpEntity.getDcpDcoPeps()).build())
                        .expositionType(ExpositionType0.newBuilder().code(dcpEntity.getDcpIndLavdin()).build())
                        .build()
                    )
                    .bankingConditionsAcceptanceDate(null)
                    .agency(Agency.newBuilder().code(dbcEntity.getDbcCodOfic()).build())
                    .bussinesOfficer(BussinesOfficer0.newBuilder().employedId(dbcEntity.getDbcCodEjec()).build())
                    .bankingType(BankingType0.newBuilder().code(dbcEntity.getDbcCodTbca()).build())
                    .debtorCategory(DebtorCategory0.newBuilder().code(dceEntity.getDceIndCate()).build())
                    .sbsCode(dbcEntity.getDbcNumSsbs())
                    .build()
                )
                .financialSummary(
                    FinancialSummary0.newBuilder()
                    .organizationMagnitude(
                        OrganizationMagnitude0.newBuilder()
                        .category(Category0.newBuilder().code(dbcEntity.getDbcIndMemp()).build())
                        .build()
                    )
                    .revenueRange(RevenueRange0.newBuilder().code(dcpEntity.getDcpIngProm()).build())
                    .build()
                )
                .build()
            )
            .build();
    }

    public CustomerPj mapToGraphqlCustomerPj(DbcEntity dbcEntity, DceEntity dceEntity, DcpEntity dcpEntity) {
        if (dbcEntity.getDbcNumRmer() == null) {
            throw new IllegalArgumentException("Esta búsqueda no está permitida en esta API, aquí solo consultas personas jurídicas.");
        }

        return CustomerPj.newBuilder()
            .cic(dbcEntity.getDbcKeyIreg())
            .personId(dbcEntity.getDbcIdcIcli())
            .customerType(CustomerType2.newBuilder().code(dbcEntity.getDbcCodTicl()).build())
            .legal(
                Dbc2pj.newBuilder()
                .legalName(dbcEntity.getDbcGlsNomc())
                .fullName(dceEntity.getDceGlsNfan())
                .demographicInformation(
                    DemographicInformation2.newBuilder()
                        .isResident("1".equals(dbcEntity.getDbcIndResi()))  // Assuming '1' means true
                        .economicActivity(EconomicActivity2.newBuilder()
                            .primary(ActivityType.newBuilder().code(dbcEntity.getDbcCodActi()).build())
                            .secondary(ActivityType.newBuilder().code(dcpEntity.getDcpCodActs()).build())
                            .build()
                        )
                        .sunarpReferenceId(dbcEntity.getDbcNumRmer())
                        .societyType(SocietyType.newBuilder().code(dceEntity.getDceCodTsoc()).build())
                        .businessPurpose(BusinessPurpose.newBuilder().code(dbcEntity.getDbcCodOdse()).build())
                        .organizationType(OrganizationType.newBuilder().code(dceEntity.getDceIndTemp()).build())
                        .constitutionDate(DateUtils.addHyphensToDateString(dceEntity.getDceFecFctt()))  // Assuming the date is not provided
                        .isBranchCompany("1".equals(dceEntity.getDceIndCmos()))
                        .build()
                )
                .internalInformation(
                    InternalInformation2.newBuilder()
                    .bankRelationship(BankRelationship.newBuilder().code(dceEntity.getDceRelBanc()).build())
                    .politicallyExposed(
                        PoliticallyExposed.newBuilder()
                        .expositionType(ExpositionType.newBuilder().code(dcpEntity.getDcpIndLavdin()).build())
                        .relationType(RelationType.newBuilder().code(dcpEntity.getDcpDcoPeps()).build())
                        .build()
                    )
                    .bankingConditionsAcceptanceDate(null)
                    .agency(Agency.newBuilder().code(dbcEntity.getDbcCodOfic()).build())
                    .businessOfficer(BussinesOfficer.newBuilder().employedId(dbcEntity.getDbcCodEjec()).build())
                    .bankingType(BankingType.newBuilder().code(dbcEntity.getDbcCodTbca()).build())
                    .debtorCategory(DebtorCategory.newBuilder().code(dceEntity.getDceIndCate()).build())
                    .sbsCode(dbcEntity.getDbcNumSsbs())
                    .build()
                )
                .financialSummary(
                    FinancialSummary.newBuilder()
                    .organizationMagnitude(
                        OrganizationMagnitude.newBuilder()
                        .category(MagnitudeCategory.newBuilder().code(dbcEntity.getDbcIndMemp()).build())
                        .build()
                    )
                    .revenueRange(RevenueRange.newBuilder().code(dcpEntity.getDcpIngProm()).build())
                    .build()
                )
                .build()
            )
            .build();
    }
}
