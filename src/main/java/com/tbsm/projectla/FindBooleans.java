package com.tbsm.projectla;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.tbsm.projectla.models.Booleans;

public class FindBooleans {
	private List<String> stuff;

	private String generalDetailsMemorandumOfLease; // Memorandum of Lease
	private String generalDetailsRulesAndRegulation; // Rules And Regulation?
	private String generalDetailsIsCostOrFairMarketValueDeterminable;// Is Cost or Fair Market Value Determinable?
	private String generalDetailsIsItMarketBased;// Is it Market-Based?
	private String generalPremiseLocationIncludedInRent; // Included In Rent
	private String rentPercentRentSetupPercentRentSetupReportingOnly; // Reporting Only
	private String rentPercentRentSetupPercentRentSetupCumulative; // Cumulative
	private String rentPercentRentSetupPercentRentSetupLandlordAuditRights; // Landlord Audit Rights
	
	private String defaultClauseDetailsIsNoticeRequiredBeforeMonetaryGracePeriodBegins; // 277 Is Notice Required Before Monetary Grace Period Begins?
	private String defaultClauseDetailsCapOnEventsOfMonetaryDefaultBeforeGracePeriod; // 279 Cap on events of Monetary Default before Grace Period?
	private String defaultClauseDetailsIsNoticeRequiredBeforeNonMonetaryGracePeriodBegins; // 281 Is Notice Required Before Non-Monetary Grace Period Begins?
	private String defaultClauseDetailsCapOnEventsOfNonMonetaryDefaultBeforeGracePeriod; // 283	Cap on events of Non-Monetary Default before Grace Period?
	private String defaultClauseDetailsGoDark; // 286 Go Dark?
	private String defaultClauseDetailsVoluntaryInvoluntaryBankruptcy; // 288 Voluntary / Involuntary Bankruptcy
	private String defaultClauseDetailsReceivership; // 290	Receivership 
	private String defaultClauseDetailsAssignedToCreditors; // 292 Assigned to Creditors 
	private String defaultClauseDetailsWrittenAdmissionOfFailureToPayDebts; // 294	Written Admission of Failure to Pay Debts 
	private String defaultClauseDetailsViolationOfLeaseProvisions; // 296 Violation of Lease Provisions
	private String defaultClauseDetailsIsNonDefaultingPartyPermittedSelfHelpRemedy; // 298	Is Non-defaulting Party Permitted self-help remedy?	
	private String defaultClauseDetailsIsDefaultingPartyObligedToReimburseCosts; // 299	Is Defaulting Party obliged to reimburse costs?
	private String defaultClauseDetailsTenantRightToCureLandlordDefaultsUnderMortgageGroundLease; // 300	Tenant right to cure Landlord defaults under Mortgage/Ground Lease?
	private String defaultClauseDetailsTenantObligedToGiveLenderNoticeOfLandlordDefaultsUnderLease; // 301	Tenant obliged to give Lender notice of Landlord defaults under Lease?

	private String securityDepositDepositDetailsSeparateAccountRequired; // 310
	private String securityDepositDepositDetailsInterestBearingAccountRequired; // 311
	private String securityDepositDepositDetailsDepositReturned; // 317
	private String securityDepositDepositDetailsAutoGenerateDepositSchedules; // 318
	private String securityDepositDepositDetailsAffectedByRent; // 326
	private String securityDepositDepositDetailsDrawdown; // 329
	
	private String rightsAlterationsLandlordConsentRequiredForAlterations; // 354 Landlord Consent Required For Alterations?
	private String rightsAlterationsExplicitDesignCriteriaForPremisesAlterations; // 356 Explicit design criteria for Premises Alterations?
	private String rightsAlterationsIsArchitecturalApprovalRequiredForAlterations; // 357 Is Architectural Approval Required for Alterations?
			
	private String rightsAssignmentSublettingLandlordConsentRequired; // 365 Landlord consent required?
	private String rightsAssignmentSublettingLandlordConsentRequiredForTransferToSubsidiaryAffiliate; // 367 LL Consent required for Transfer to subsidiary/Affiliate?
	private String rightsAssignmentSublettingTenantRequiredToPayLandlordReasonableCostsForRequestForConsent; // 368 Tenant required to pay LL reasonable costs for request for consent?
	private String rightsAssignmentSublettingLandlordPermittedToRecaptureThePremises; // 369	Landlord permitted to recapture the Premises?
	private String rightsAssignmentSublettingTenantRequiredToPayLandlordExcessConsiderationForTransfer; // 370	Tenant required to pay LL excess consideration for transfer?
	private String rightsAssignmentSublettingFeeRequiredForRequestForConsent; // 714 Fee required for request for consent?

	private String rightsHoldoverConsequentialDamagesPayable; // 380 Consequential Damages Payable?
	private String rightsHoldoverTenancyTerminatedUponNotice; // 382 Tenancy Terminated Upon Notice?
	
	private String rightsOtherRightsIncludesIndexAdjustment; // 390 Includes Index Adjustment?
	private String rightsOtherRightsWaiverOfSubrogation; // 713 Waiver of Subrogation?
	
	private String rightsSignageLandlordConsentRequiredForSignageChange; // 405 LL Consent required for signage change?
	private String rightsSignageIsThereExplicitDesignCriteriaForTenantsSignage; // 406 Is there explicit design criteria for Tenant's signage?
	private String rightsSignageTenantToPayRemovalCosts; // 407 Tenant to pay removal costs?
	private String rightsSignageTenantRequiredToRemoveUponLeaseExpiration; // 408 Tenant required to remove upon Lease Expiration?
	private String rightsSignageIsThereAPylonSign; // 409 Is there a Pylon Sign?
	private String rightsSignageIsLocationSizeOfTenantsPanelBasedOnPrsOfShoppingCenter; // 410 Is location/size of Tenant's panel based on PRS of Shopping Center?
	private String rightsSignageLandlordConsentRequiredForPylonSignageChange; // 411 LL Consent required for Pylon Signage change?
	private String rightsSignageThirdPartyConsentRequiredForChangeToPylonSignage; // 412 Third Party consent required for change to Pylon Signage?
	
	private String rightsConditionPremisesSurrenderPremisesReturnedToOriginalCondition; // 420	Premises returned to original condition
	private String rightsConditionPremisesSurrenderWearAndTearExcepted; // 421	Wear/tear excepted
	private String rightsConditionPremisesSurrenderBroomClean; // 422 Broom Clean
	private String rightsConditionPremisesSurrenderCasualtyCondemnationExcepted; // 423 Casualty/Condemnation excepted
	private String rightsConditionPremisesSurrenderRemovalOfTradeFixturesPermitted; // 424	Removal of trade fixtures permitted?
	private String rightsConditionPremisesSurrenderRemovalOfAlterationsPermittedDuringLeaseTerm; // 425 Removal of Alterations Permitted during Lease Term?
	private String rightsConditionPremisesSurrenderPropertyLeftBehindDeemedAbandoned; // 426 Property left behind deemed abandoned?
	private String rightsConditionPremisesSurrenderRemovalOfAlterationsRequiredUponLandlordRequest; // 427	Removal of Alterations required upon Landlord request?
	private String rightsConditionPremisesSurrenderRemovalOfAlterationsPermittedAfterLeaseExpiration; // 429 Removal of Alterations permitted after Lease Expiration?
	private String rightsConditionPremisesSurrenderTenantToPayRemovalCosts; // 430	Tenant to pay removal costs?
	private String rightsConditionPremisesSurrenderTenantRequiredToRemoveAlterationsAtLeaseExpiration; // 431 Tenant required to remove alterations at Lease Expiration?
	private String rightsConditionPremisesSurrenderRemovalRepairDamageRequired; // 715	Removal repair damage required?
	
	private String allowancesImprovementClauseDetailsLandlordConsent; // 450 LL Consent
	private String allowancesImprovementClauseDetailsTiAllowanceReceived; // 451 TI Allowance Received		
	private String allowancesImprovementClauseDetailsCanUnusedAllowanceBeAppliedToRent; // 462 Can un-used allowance be applied to rent?
	private String allowancesImprovementClauseDetailsCanAdditionalAllowanceCostsBeAmortized; // 463 Can additional Allowance costs be amortized?
	
	private String opexCamCamAuditSetupResponsibleForExpansionIncreases; // 484 Responsible for Expansion Increases?		
	private String opexCamCamAuditSetupProofOfPaymentRequired; // 486 Proof of Payment Required?		
	private String opexCamCamAuditSetupSupportingDocumentsRequired; // 488 Supporting Documents Required?		
	private String opexCamCamAuditSetupLandlordCreditAllowed; // 490 Landlord Credit Allowed?		
	
	private String opexCamServicesIncludedApplyToTotalCap; // 498 Apply to Total CAP
	
	private String insuranceClauseDetailsIncludesIndexAdjustment; // 518 Includes Index Adjustment?
	
	private String insuranceInsuranceClauseDetailsPolicyRequired; // 523 Policy Required
	private String insuranceInsuranceClauseDetailsCertificationRequired; // 525 Certification Required?
	private String insuranceInsuranceClauseDetailsLandlordAlsoNamedInsured; // 526 Landlord Also Named Insured		
	private String insuranceInsuranceClauseDetailsCertificateOnLease; // 527 Certificate on Lease
	private String insuranceInsuranceClauseDetailsAgentAlsoNamedInsured; // 528 Agent Also Named Insured		
	private String insuranceInsuranceClauseDetailsTenantAlsoNamedInsured; // 530 Tenant Also Named Insured		
	private String insuranceInsuranceClauseDetailsTenantMaySelfInsure; // 535 Tenant may Self-Insure
	private String insuranceInsuranceClauseDetailsUmbrellaBlanketCoveragePermitted; // 537 Umbrella / Blanket Coverage permitted
	
	private String taxClauseDetailsIncludesIndexAdjustment; // 557 Includes Index Adjustment?
	
	private String taxTaxDetailsDoesTenantHaveRightToAppealTax; // 563 Does Tenant have Right to Appeal Tax?
	private String taxTaxDetailsAreDiscountsEntitled; // 564 Are Discounts Entitled?		
	private String taxTaxDetailsIsAttorneyRequiredForAppeals; // 565 Is Attorney Required for Appeals?
	private String taxTaxDetailsAreAppealFeesIncludedInProRata; // 567 Are Appeal Fees Included in Pro-Rata?
	private String taxTaxDetailsAreConsultingFeesIncludedInProRata; // 568 Are Consulting Fees Included in Pro-Rata?		
	private String taxTaxDetailsTaxesPaidDirectlyToMunicipality; // 569 Taxes Paid Directly to Municipality?
	private String taxTaxDetailsIfTaxesReimbursedLandlordRequiredToProvideTaxBill; // 570 If Taxes Reimbursed, landlord required to provide tax bill?
	private String taxTaxDetailsRightToContestTaxes; // 571 Right to Contest Taxes?
	
	private String parkingParkingDetailsIncludedInRent; // 590 Included In Rent
	
	private String parkingSpaceTypesIncludeInParkingSpaceCount; // 593 Include In Parking Space Count
	
	private String coTenancyCoTenancyDetailsGoDark; // 608 Go Dark?
	private String coTenancyCoTenancyDetailsTermination; // 610 Termination?
	
	private String greenLeaseProvisionsClauseDetailsBuildingOperationManual; // 629 Building Operation Manual
	private String greenLeaseProvisionsClauseDetailsAccessToBuildingLoadingDock; // 630 Access to Bldg. / Loading Dock		
	private String greenLeaseProvisionsClauseDetailsFreightElevator; // 631 Freight Elevator
	private String greenLeaseProvisionsClauseDetailsAccessToPremisesForConstruction; // 632 Access to Premises for Construction		
	private String greenLeaseProvisionsClauseDetailsAsBuiltPlansSpecsExistingFitOut; // 633 As-built: Plans & Specs Existing Fit Out
	private String greenLeaseProvisionsClauseDetailsAsBuiltBaseBuildingPlansSpecs; // 634 As-built: Base Bldg. Plans & Specs		
	private String greenLeaseProvisionsClauseDetailsOwnCarriers; // 635 Own Carriers
	private String greenLeaseProvisionsClauseDetailsIs24x7BuildingServicesHvac; // 636 24x7 Bldg. Services / HVAC		
	private String greenLeaseProvisionsClauseDetailsTieIntoLeaseSecurity; // 637 Tie into L Security
	private String greenLeaseProvisionsClauseDetailsTieIntoBms; // 638 Tie into BMS		
	private String greenLeaseProvisionsClauseDetailsComposting; // 639 Composting
	private String greenLeaseProvisionsClauseDetailsRecycling; // 640 Recycling		
	
	private String responsibilitiesResponsibilityServiceIncludedInRent; // 662 Included In Rent
	
	private String otherClausesOtherClausesIncludesIndexAdjustment; // 676 Includes Index Adjustment?
	
	private String accountingAccountingCreateStraightLineAdjustments; // 688 Create Straight Line Adjustments
	
	private String accountingFasb13TreatmentIsLessorImplicitInterestKnown; // 702 Is lessor implicit interest known?
	private String accountingFasb13TreatmentDoesPropertyTransferOwnershipAtTheEndOfTheLease; // 703 Does property transfer ownership at the end of the lease?
	private String accountingFasb13TreatmentDoesTheLeaseHaveBargainPurchaseOption; // 705 Does the lease have a bargain purchase option?
	private String accountingFasb13TreatmentDoesLeaseBeginInTheLast25PercentOfBuildingLife; // 707 Does Lease begin in the last 25% of Building Life?
	
	
	public FindBooleans(List<String> stuff) {
		this.stuff = stuff;
	}
	
	
	public Booleans processBooleans() {		
		Booleans booleans = new Booleans();
		
		//booleans.setGeneralAbstractNotificationsNotifyMeHowLongPrior( searchBoolean( generalAbstractNotificationsNotifyMeHowLongPrior ) ); // Notify me how long prior (Milliseconds)?
		
		booleans.setGeneralDetailsMemorandumOfLease( searchBoolean( generalDetailsMemorandumOfLease ) );
		booleans.setGeneralDetailsRulesAndRegulation( searchBoolean( generalDetailsRulesAndRegulation ) );
		booleans.setGeneralDetailsIsCostOrFairMarketValueDeterminable( searchBoolean( generalDetailsIsCostOrFairMarketValueDeterminable ) );
		booleans.setGeneralDetailsIsItMarketBased( searchBoolean( generalDetailsIsItMarketBased ) );
		booleans.setGeneralPremiseLocationIncludedInRent( searchBoolean( generalPremiseLocationIncludedInRent ) );
		booleans.setRentPercentRentSetupPercentRentSetupReportingOnly(searchBoolean(rentPercentRentSetupPercentRentSetupReportingOnly));
		booleans.setRentPercentRentSetupPercentRentSetupCumulative(searchBoolean(rentPercentRentSetupPercentRentSetupCumulative));
		booleans.setRentPercentRentSetupPercentRentSetupLandlordAuditRights(searchBoolean(rentPercentRentSetupPercentRentSetupLandlordAuditRights));
		booleans.setDefaultClauseDetailsIsNoticeRequiredBeforeMonetaryGracePeriodBegins(searchBoolean(defaultClauseDetailsIsNoticeRequiredBeforeMonetaryGracePeriodBegins));
		booleans.setDefaultClauseDetailsCapOnEventsOfMonetaryDefaultBeforeGracePeriod(searchBoolean(defaultClauseDetailsCapOnEventsOfMonetaryDefaultBeforeGracePeriod));
		booleans.setDefaultClauseDetailsIsNoticeRequiredBeforeNonMonetaryGracePeriodBegins(searchBoolean(defaultClauseDetailsIsNoticeRequiredBeforeNonMonetaryGracePeriodBegins));
		booleans.setDefaultClauseDetailsCapOnEventsOfNonMonetaryDefaultBeforeGracePeriod(searchBoolean(defaultClauseDetailsCapOnEventsOfNonMonetaryDefaultBeforeGracePeriod));
		booleans.setDefaultClauseDetailsGoDark(searchBoolean(defaultClauseDetailsGoDark));
		booleans.setDefaultClauseDetailsVoluntaryInvoluntaryBankruptcy(searchBoolean(defaultClauseDetailsVoluntaryInvoluntaryBankruptcy));
		booleans.setDefaultClauseDetailsReceivership(searchBoolean(defaultClauseDetailsReceivership));
		booleans.setDefaultClauseDetailsAssignedToCreditors(searchBoolean(defaultClauseDetailsAssignedToCreditors));
		booleans.setDefaultClauseDetailsWrittenAdmissionOfFailureToPayDebts(searchBoolean(defaultClauseDetailsWrittenAdmissionOfFailureToPayDebts));
		booleans.setDefaultClauseDetailsViolationOfLeaseProvisions(searchBoolean(defaultClauseDetailsViolationOfLeaseProvisions));
		booleans.setDefaultClauseDetailsIsNonDefaultingPartyPermittedSelfHelpRemedy(searchBoolean(defaultClauseDetailsIsNonDefaultingPartyPermittedSelfHelpRemedy));
		booleans.setDefaultClauseDetailsIsDefaultingPartyObligedToReimburseCosts(searchBoolean(defaultClauseDetailsIsDefaultingPartyObligedToReimburseCosts));
		booleans.setDefaultClauseDetailsTenantRightToCureLandlordDefaultsUnderMortgageGroundLease(searchBoolean(defaultClauseDetailsTenantRightToCureLandlordDefaultsUnderMortgageGroundLease));
		booleans.setDefaultClauseDetailsTenantObligedToGiveLenderNoticeOfLandlordDefaultsUnderLease(searchBoolean(defaultClauseDetailsTenantObligedToGiveLenderNoticeOfLandlordDefaultsUnderLease));
		booleans.setSecurityDepositDepositDetailsSeparateAccountRequired(searchBoolean(securityDepositDepositDetailsSeparateAccountRequired));
		booleans.setSecurityDepositDepositDetailsInterestBearingAccountRequired(searchBoolean(securityDepositDepositDetailsInterestBearingAccountRequired));
		booleans.setSecurityDepositDepositDetailsDepositReturned(searchBoolean(securityDepositDepositDetailsDepositReturned));
		booleans.setSecurityDepositDepositDetailsAutoGenerateDepositSchedules(searchBoolean(securityDepositDepositDetailsAutoGenerateDepositSchedules));
		booleans.setSecurityDepositDepositDetailsAffectedByRent(searchBoolean(securityDepositDepositDetailsAffectedByRent));
		booleans.setSecurityDepositDepositDetailsDrawdown(searchBoolean(securityDepositDepositDetailsDrawdown));
		booleans.setRightsAlterationsLandlordConsentRequiredForAlterations(searchBoolean(rightsAlterationsLandlordConsentRequiredForAlterations));
		booleans.setRightsAlterationsExplicitDesignCriteriaForPremisesAlterations(searchBoolean(rightsAlterationsExplicitDesignCriteriaForPremisesAlterations));
		booleans.setRightsAlterationsIsArchitecturalApprovalRequiredForAlterations(searchBoolean(rightsAlterationsIsArchitecturalApprovalRequiredForAlterations));
		booleans.setRightsAssignmentSublettingLandlordConsentRequired(searchBoolean(rightsAssignmentSublettingLandlordConsentRequired));
		booleans.setRightsAssignmentSublettingLandlordConsentRequiredForTransferToSubsidiaryAffiliate(searchBoolean(rightsAssignmentSublettingLandlordConsentRequiredForTransferToSubsidiaryAffiliate));
		booleans.setRightsAssignmentSublettingTenantRequiredToPayLandlordReasonableCostsForRequestForConsent(searchBoolean(rightsAssignmentSublettingTenantRequiredToPayLandlordReasonableCostsForRequestForConsent));
		booleans.setRightsAssignmentSublettingLandlordPermittedToRecaptureThePremises(searchBoolean(rightsAssignmentSublettingLandlordPermittedToRecaptureThePremises));
		booleans.setRightsAssignmentSublettingTenantRequiredToPayLandlordExcessConsiderationForTransfer(searchBoolean(rightsAssignmentSublettingTenantRequiredToPayLandlordExcessConsiderationForTransfer));
		booleans.setRightsAssignmentSublettingFeeRequiredForRequestForConsent(searchBoolean(rightsAssignmentSublettingFeeRequiredForRequestForConsent));
		booleans.setRightsHoldoverConsequentialDamagesPayable(searchBoolean(rightsHoldoverConsequentialDamagesPayable));
		booleans.setRightsHoldoverTenancyTerminatedUponNotice(searchBoolean(rightsHoldoverTenancyTerminatedUponNotice));
		booleans.setRightsOtherRightsIncludesIndexAdjustment(searchBoolean(rightsOtherRightsIncludesIndexAdjustment));
		booleans.setRightsOtherRightsWaiverOfSubrogation(searchBoolean(rightsOtherRightsWaiverOfSubrogation));
		booleans.setRightsSignageLandlordConsentRequiredForSignageChange(searchBoolean(rightsSignageLandlordConsentRequiredForSignageChange));
		booleans.setRightsSignageIsThereExplicitDesignCriteriaForTenantsSignage(searchBoolean(rightsSignageIsThereExplicitDesignCriteriaForTenantsSignage));
		booleans.setRightsSignageTenantToPayRemovalCosts(searchBoolean(rightsSignageTenantToPayRemovalCosts));
		booleans.setRightsSignageTenantRequiredToRemoveUponLeaseExpiration(searchBoolean(rightsSignageTenantRequiredToRemoveUponLeaseExpiration));
		booleans.setRightsSignageIsThereAPylonSign(searchBoolean(rightsSignageIsThereAPylonSign));
		booleans.setRightsSignageIsLocationSizeOfTenantsPanelBasedOnPrsOfShoppingCenter(searchBoolean(rightsSignageIsLocationSizeOfTenantsPanelBasedOnPrsOfShoppingCenter));
		booleans.setRightsSignageLandlordConsentRequiredForPylonSignageChange(searchBoolean(rightsSignageLandlordConsentRequiredForPylonSignageChange));
		booleans.setRightsSignageThirdPartyConsentRequiredForChangeToPylonSignage(searchBoolean(rightsSignageThirdPartyConsentRequiredForChangeToPylonSignage));
		booleans.setRightsConditionPremisesSurrenderPremisesReturnedToOriginalCondition(searchBoolean(rightsConditionPremisesSurrenderPremisesReturnedToOriginalCondition));
		booleans.setRightsConditionPremisesSurrenderWearAndTearExcepted(searchBoolean(rightsConditionPremisesSurrenderWearAndTearExcepted));
		booleans.setRightsConditionPremisesSurrenderBroomClean(searchBoolean(rightsConditionPremisesSurrenderBroomClean));
		
		booleans.setRightsConditionPremisesSurrenderCasualtyCondemnationExcepted(searchBoolean(rightsConditionPremisesSurrenderCasualtyCondemnationExcepted));
		booleans.setRightsConditionPremisesSurrenderRemovalOfTradeFixturesPermitted(searchBoolean(rightsConditionPremisesSurrenderRemovalOfTradeFixturesPermitted));
		booleans.setRightsConditionPremisesSurrenderRemovalOfAlterationsPermittedDuringLeaseTerm(searchBoolean(rightsConditionPremisesSurrenderRemovalOfAlterationsPermittedDuringLeaseTerm));
		booleans.setRightsConditionPremisesSurrenderPropertyLeftBehindDeemedAbandoned(searchBoolean(rightsConditionPremisesSurrenderPropertyLeftBehindDeemedAbandoned));
		booleans.setRightsConditionPremisesSurrenderRemovalOfAlterationsRequiredUponLandlordRequest(searchBoolean(rightsConditionPremisesSurrenderRemovalOfAlterationsRequiredUponLandlordRequest));
		booleans.setRightsConditionPremisesSurrenderRemovalOfAlterationsPermittedAfterLeaseExpiration(searchBoolean(rightsConditionPremisesSurrenderRemovalOfAlterationsPermittedAfterLeaseExpiration));
		booleans.setRightsConditionPremisesSurrenderTenantToPayRemovalCosts(searchBoolean(rightsConditionPremisesSurrenderTenantToPayRemovalCosts));
		booleans.setRightsConditionPremisesSurrenderTenantRequiredToRemoveAlterationsAtLeaseExpiration(searchBoolean(rightsConditionPremisesSurrenderTenantRequiredToRemoveAlterationsAtLeaseExpiration));
		booleans.setRightsConditionPremisesSurrenderRemovalRepairDamageRequired(searchBoolean(rightsConditionPremisesSurrenderRemovalRepairDamageRequired));
		booleans.setAllowancesImprovementClauseDetailsLandlordConsent(searchBoolean(allowancesImprovementClauseDetailsLandlordConsent));
		booleans.setAllowancesImprovementClauseDetailsTiAllowanceReceived(searchBoolean(allowancesImprovementClauseDetailsTiAllowanceReceived));
		booleans.setAllowancesImprovementClauseDetailsCanUnusedAllowanceBeAppliedToRent(searchBoolean(allowancesImprovementClauseDetailsCanUnusedAllowanceBeAppliedToRent));
		booleans.setAllowancesImprovementClauseDetailsCanAdditionalAllowanceCostsBeAmortized(searchBoolean(allowancesImprovementClauseDetailsCanAdditionalAllowanceCostsBeAmortized));
		booleans.setOpexCamCamAuditSetupResponsibleForExpansionIncreases(searchBoolean(opexCamCamAuditSetupResponsibleForExpansionIncreases));
		booleans.setOpexCamCamAuditSetupProofOfPaymentRequired(searchBoolean(opexCamCamAuditSetupProofOfPaymentRequired));
		booleans.setOpexCamCamAuditSetupSupportingDocumentsRequired(searchBoolean(opexCamCamAuditSetupSupportingDocumentsRequired));
		booleans.setOpexCamCamAuditSetupLandlordCreditAllowed(searchBoolean(opexCamCamAuditSetupLandlordCreditAllowed));
		booleans.setOpexCamServicesIncludedApplyToTotalCap(searchBoolean(opexCamServicesIncludedApplyToTotalCap));
		booleans.setInsuranceClauseDetailsIncludesIndexAdjustment(searchBoolean(insuranceClauseDetailsIncludesIndexAdjustment));
		booleans.setInsuranceInsuranceClauseDetailsPolicyRequired(searchBoolean(insuranceInsuranceClauseDetailsPolicyRequired));
		booleans.setInsuranceInsuranceClauseDetailsCertificationRequired(searchBoolean(insuranceInsuranceClauseDetailsCertificationRequired));
		booleans.setInsuranceInsuranceClauseDetailsLandlordAlsoNamedInsured(searchBoolean(insuranceInsuranceClauseDetailsLandlordAlsoNamedInsured));
		booleans.setInsuranceInsuranceClauseDetailsCertificateOnLease(searchBoolean(insuranceInsuranceClauseDetailsCertificateOnLease));
		booleans.setInsuranceInsuranceClauseDetailsAgentAlsoNamedInsured(searchBoolean(insuranceInsuranceClauseDetailsAgentAlsoNamedInsured));
		booleans.setInsuranceInsuranceClauseDetailsTenantAlsoNamedInsured(searchBoolean(insuranceInsuranceClauseDetailsTenantAlsoNamedInsured));
		booleans.setInsuranceInsuranceClauseDetailsTenantMaySelfInsure(searchBoolean(insuranceInsuranceClauseDetailsTenantMaySelfInsure));
		booleans.setInsuranceInsuranceClauseDetailsUmbrellaBlanketCoveragePermitted(searchBoolean(insuranceInsuranceClauseDetailsUmbrellaBlanketCoveragePermitted));
		booleans.setTaxClauseDetailsIncludesIndexAdjustment(searchBoolean(taxClauseDetailsIncludesIndexAdjustment));
		booleans.setTaxTaxDetailsDoesTenantHaveRightToAppealTax(searchBoolean(taxTaxDetailsDoesTenantHaveRightToAppealTax));
		booleans.setTaxTaxDetailsAreDiscountsEntitled(searchBoolean(taxTaxDetailsAreDiscountsEntitled));
		booleans.setTaxTaxDetailsIsAttorneyRequiredForAppeals(searchBoolean(taxTaxDetailsIsAttorneyRequiredForAppeals));
		booleans.setTaxTaxDetailsAreAppealFeesIncludedInProRata(searchBoolean(taxTaxDetailsAreAppealFeesIncludedInProRata));
		booleans.setTaxTaxDetailsAreConsultingFeesIncludedInProRata(searchBoolean(taxTaxDetailsAreConsultingFeesIncludedInProRata));
		booleans.setTaxTaxDetailsTaxesPaidDirectlyToMunicipality(searchBoolean(taxTaxDetailsTaxesPaidDirectlyToMunicipality));
		booleans.setTaxTaxDetailsIfTaxesReimbursedLandlordRequiredToProvideTaxBill(searchBoolean(taxTaxDetailsIfTaxesReimbursedLandlordRequiredToProvideTaxBill));
		booleans.setTaxTaxDetailsRightToContestTaxes(searchBoolean(taxTaxDetailsRightToContestTaxes));
		booleans.setParkingParkingDetailsIncludedInRent(searchBoolean(parkingParkingDetailsIncludedInRent));
		booleans.setParkingSpaceTypesIncludeInParkingSpaceCount(searchBoolean(parkingSpaceTypesIncludeInParkingSpaceCount));
		booleans.setCoTenancyCoTenancyDetailsGoDark(searchBoolean(coTenancyCoTenancyDetailsGoDark));
		booleans.setCoTenancyCoTenancyDetailsTermination(searchBoolean(coTenancyCoTenancyDetailsTermination));
		booleans.setGreenLeaseProvisionsClauseDetailsBuildingOperationManual(searchBoolean(greenLeaseProvisionsClauseDetailsBuildingOperationManual));
		booleans.setGreenLeaseProvisionsClauseDetailsAccessToBuildingLoadingDock(searchBoolean(greenLeaseProvisionsClauseDetailsAccessToBuildingLoadingDock));
		booleans.setGreenLeaseProvisionsClauseDetailsFreightElevator(searchBoolean(greenLeaseProvisionsClauseDetailsFreightElevator));
		booleans.setGreenLeaseProvisionsClauseDetailsAccessToPremisesForConstruction(searchBoolean(greenLeaseProvisionsClauseDetailsAccessToPremisesForConstruction));
		booleans.setGreenLeaseProvisionsClauseDetailsAsBuiltPlansSpecsExistingFitOut(searchBoolean(greenLeaseProvisionsClauseDetailsAsBuiltPlansSpecsExistingFitOut));
		booleans.setGreenLeaseProvisionsClauseDetailsAsBuiltBaseBuildingPlansSpecs(searchBoolean(greenLeaseProvisionsClauseDetailsAsBuiltBaseBuildingPlansSpecs));
		booleans.setGreenLeaseProvisionsClauseDetailsOwnCarriers(searchBoolean(greenLeaseProvisionsClauseDetailsOwnCarriers));
		booleans.setGreenLeaseProvisionsClauseDetailsIs24x7BuildingServicesHvac(searchBoolean(greenLeaseProvisionsClauseDetailsIs24x7BuildingServicesHvac));
		booleans.setGreenLeaseProvisionsClauseDetailsTieIntoLeaseSecurity(searchBoolean(greenLeaseProvisionsClauseDetailsTieIntoLeaseSecurity));
		booleans.setGreenLeaseProvisionsClauseDetailsTieIntoBms(searchBoolean(greenLeaseProvisionsClauseDetailsTieIntoBms));
		booleans.setGreenLeaseProvisionsClauseDetailsComposting(searchBoolean(greenLeaseProvisionsClauseDetailsComposting));
		booleans.setGreenLeaseProvisionsClauseDetailsRecycling(searchBoolean(greenLeaseProvisionsClauseDetailsRecycling));
		booleans.setResponsibilitiesResponsibilityServiceIncludedInRent(searchBoolean(responsibilitiesResponsibilityServiceIncludedInRent));
		booleans.setOtherClausesOtherClausesIncludesIndexAdjustment(searchBoolean(otherClausesOtherClausesIncludesIndexAdjustment));
		booleans.setAccountingAccountingCreateStraightLineAdjustments(searchBoolean(accountingAccountingCreateStraightLineAdjustments));
		booleans.setAccountingFasb13TreatmentIsLessorImplicitInterestKnown(searchBoolean(accountingFasb13TreatmentIsLessorImplicitInterestKnown));
		booleans.setAccountingFasb13TreatmentDoesPropertyTransferOwnershipAtTheEndOfTheLease(searchBoolean(accountingFasb13TreatmentDoesPropertyTransferOwnershipAtTheEndOfTheLease));
		booleans.setAccountingFasb13TreatmentDoesTheLeaseHaveBargainPurchaseOption(searchBoolean(accountingFasb13TreatmentDoesTheLeaseHaveBargainPurchaseOption));
		booleans.setAccountingFasb13TreatmentDoesLeaseBeginInTheLast25PercentOfBuildingLife(searchBoolean(accountingFasb13TreatmentDoesLeaseBeginInTheLast25PercentOfBuildingLife));
		
		return booleans;		
	}
	
	private Boolean searchBoolean(String s) {
		if( s != null && s != "" ) {
			List<String> criteriaList = Arrays.asList(s.split(","));				
			for (String criteria : criteriaList) {
				Optional<String> map = stuff.stream()
			      .filter (e -> e.toLowerCase().contains( criteria.toLowerCase() )).findFirst();
				
				if(map.isPresent()) {
					return true;
				}
			}
		}
		return null;		
	}
}