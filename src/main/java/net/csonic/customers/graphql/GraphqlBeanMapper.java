package net.csonic.customers.graphql;

import net.csonic.customers.graphql.datasource.entity.*;
import net.csonic.customers.graphql.service.encryption.ICryptoHmacSha256;
// import net.csonic.customers.graphql.service.encryption.ICryptoService;
import net.csonic.customers.graphql.types.*;
import org.ocpsoft.prettytime.PrettyTime;
import net.csonic.customers.graphql.utils.DateUtils;
import org.springframework.stereotype.Component;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.time.ZoneOffset;
// import java.util.Locale.Category;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;

@Component
public class GraphqlBeanMapper {

    private static final PrettyTime PRETTY_TIME = new PrettyTime();
    private static final ZoneOffset ZONE_OFFSET = ZoneOffset.ofHours(5);
    private static final int ENABLE_ENCRYPT     = 0; 
    private final ICryptoHmacSha256 cryptoService;


    public GraphqlBeanMapper(ICryptoHmacSha256 cryptoService) {
        this.cryptoService = cryptoService;
    }


    public Emails mapToGraphql(DccEntity dccEntity) {
        return Emails.newBuilder()
                .email(decrypt(dccEntity.getDccCorreo()))
                .emailState(EmailState.newBuilder().code(dccEntity.getDccEstadoCorreo()).build())
                .emailType(EmailType.newBuilder().code(dccEntity.getDccTipoCorreoId()).build())
                .build();
    }

    public Dire mapToGraphql(DdcEntity ddcEntity) {
        return Dire.newBuilder()
                .type(Type.newBuilder().code(ddcEntity.getDdcMscTdir()).build())
                .status(Status.newBuilder().code(ddcEntity.getDdcMscSdir()).build())
                .street(
                        Street.newBuilder()
                                .code(decrypt(ddcEntity.getDdcCodTvia()))
                                .name(decrypt(ddcEntity.getDdcMscBvia()))
                                .number(decrypt(ddcEntity.getDdcNumeracion()))
                                .build()
                )
                .building(
                        Building.newBuilder()
                                .code(decrypt(ddcEntity.getDdcMscDpir()))
                                .number(decrypt(ddcEntity.getDdcNumDpir()))
                                .build()
                )
                .blockCode(decrypt(ddcEntity.getDdcMscMnza()))
                .lotNumber(decrypt(ddcEntity.getDdcMscLote()))
                .urbanization(
                        Urbanization.newBuilder()
                                .code(decrypt(ddcEntity.getDdcCodTchb()))
                                .name(decrypt(ddcEntity.getDdcMscCjhb()))
                                .build()
                )
                .zone(
                        Zone.newBuilder()
                                .code(decrypt(ddcEntity.getDdcCodSezn()))
                                .name(decrypt(ddcEntity.getDdcMscSezn()))
                                .build()
                )
                .reference(decrypt(ddcEntity.getDdcGlsRefe()))
                .geolocation(Geolocation.newBuilder().equivalentCode(ddcEntity.getDdcCodLuga()).build())
                .summary(decrypt(ddcEntity.getDdcGlsComDire()))
                .build();
    }

    public ThirdPartyRelationships mapToGraphql(RecEntity recEntity) {
        return ThirdPartyRelationships.newBuilder()
                .type(Type.newBuilder().code(recEntity.getRecCodTrec()).build())
                .subType(SubType2.newBuilder().code(recEntity.getRecCodArec()).build())
                .relatedPerson(RelatedPerson.newBuilder().cic(recEntity.getRecCicIrel()).build())
                .validityDateRange(
                        validityDateRange2.newBuilder()
                                .from(DateUtils.addHyphensToDateString(recEntity.getRecFecFini()))
                                .to(DateUtils.addHyphensToDateString(recEntity.getRecFecFter()))
                                .build()
                )
                .shareHolderParticipation(
                        ShareHolderParticipation.newBuilder()
                                .valueAssociated(recEntity.getRecCodArec())
                                .valueCodeAssociated(recEntity.getRecSgvArec())
                                .registerDate(DateUtils.addHyphensToDateString(recEntity.getRecFecFval()))
                                .verificationDate(DateUtils.addHyphensToDateString(recEntity.getRecFecFvrf()))
                                .build()
                )
                .build();
    }

    public Phones mapToGraphql(DtcEntity dtcEntity) {
        return Phones.newBuilder()
                .phoneNumber(decrypt(dtcEntity.getDtcNumero()))
                .phoneType(PhoneType.newBuilder().code(dtcEntity.getDtcTipoTelefonoId()).build())
                .phoneState(PhoneState.newBuilder().code(dtcEntity.getDtcEstado()).build())
                .phoneClasification(PhoneClasification.newBuilder().code(dtcEntity.getDtcClasificacionId()).build())
                .phoneAnexo(PhoneAnexo.newBuilder().code(dtcEntity.getDtcAnexo()).build())
                .phonePais(PhonePais.newBuilder().code(dtcEntity.getDtcCodPais()).build())
                .phoneArea(PhoneArea.newBuilder().code(decrypt(dtcEntity.getDtcCodArea())).build())
                .build();
    }

    public CustomerPn mapToGraphqlCustomerPn(DbcEntity dbcEntity, DceEntity dceEntity, DcpEntity dcpEntity) {
        if (dbcEntity.getDbcIndTicl().equals("E")) {
            throw new IllegalArgumentException("Esta búsqueda no está permitida en esta API, aquí solo consultas personas naturales.");
        }

        return CustomerPn.newBuilder()
                .cic(dbcEntity.getDbcKeyIreg())
                .personId(dbcEntity.getDbcIdcIcli())
                .customerType(CustomerType.newBuilder().code(dbcEntity.getDbcCodTicl()).build())
                .natural(
                        Dbc2pn.newBuilder()
                                .document(
                                        Document.newBuilder()
                                                .dniDigitVerify("-1")
                                                .foreignFullDocument("-1"/*decrypt(dbcEntity.getDbcNumRmer())*/).build()
                                )
                                // .firstName(decrypt(dbcEntity.getDbcGlsNomPrimer()))
                                // .secondName(decrypt(dbcEntity.getDbcGlsNomSegundo()))
                                .fatherLastName(decrypt(dbcEntity.getDbcGlsApat()))
                                .motherLastName(decrypt(dbcEntity.getDbcGlsAmat()))
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
        if (dbcEntity.getDbcIndTicl().equals("P")) {
            throw new IllegalArgumentException("Esta búsqueda no está permitida en esta API, aquí solo consultas personas jurídicas.");
        }

        return CustomerPj.newBuilder()
                .cic(dbcEntity.getDbcKeyIreg())
                .personId(dbcEntity.getDbcIdcIcli())
                .customerType(CustomerType2.newBuilder().code(dbcEntity.getDbcCodTicl()).build())
                .legal(
                        Dbc2pj.newBuilder()
                                .legalName(decrypt(dbcEntity.getDbcGlsNomc()))
                                .fullName(decrypt(dceEntity.getDceGlsNfan()))
                                .demographicInformation(
                                        DemographicInformation2.newBuilder()
                                                .isResident("1".equals(dbcEntity.getDbcIndResi()))  // Assuming '1' means true
                                                .economicActivity(EconomicActivity2.newBuilder()
                                                        .primary(ActivityType.newBuilder().code(dbcEntity.getDbcCodActi()).build())
                                                        .secondary(ActivityType.newBuilder().code(dcpEntity.getDcpCodActs()).build())
                                                        .build()
                                                )
                                                .sunarpReferenceId( "-1" /*decrypt(dbcEntity.getDbcNumRmer()) */)
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

    private String decrypt(String input) {
        if (ENABLE_ENCRYPT == 0) {
                return input;
        }

        try {
                        return cryptoService.decrypt2(input);
                } catch (InvalidAlgorithmParameterException | InvalidKeyException | 
                        IllegalBlockSizeException | BadPaddingException e) {
                        throw new RuntimeException("Error dutante encriptación: " + e.getMessage(), e);
        }
    }



}
