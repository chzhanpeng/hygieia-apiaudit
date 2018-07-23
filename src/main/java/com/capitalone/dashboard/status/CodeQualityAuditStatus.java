package com.capitalone.dashboard.status;

public enum CodeQualityAuditStatus {
    CODE_QUALITY_AUDIT_FAIL,
    STATIC_SECURITY_SCAN_FAIL,
    CODE_QUALITY_AUDIT_GATE_MISSING,
    QUALITY_PROFILE_VALIDATION_AUDIT_OK,
    QUALITY_PROFILE_VALIDATION_AUDIT_FAIL,
    QUALITY_PROFILE_VALIDATION_AUDIT_NO_CHANGE,
    CODE_QUALITY_AUDIT_OK,
    CODE_QUALITY_DETAIL_MISSING,
    STATIC_SECURITY_SCAN_AUDIT_NO_CHANGE,
    STATIC_SECURITY_SCAN_MISSING,
    STATIC_SECURITY_SCAN_OK,
    STATIC_SECURITY_SCAN_NO_CLOSED_FINDINGS,
    STATIC_SECURITY_SCAN_FOUND_CRITICAL,
    STATIC_SECURITY_SCAN_FOUND_HIGH,
    CODE_QUALITY_GATES_FOUND,
    CODE_QUALITY_CHECK_IS_CURRENT,
    CODE_QUALITY_THRESHOLD_BLOCKER_MET,
    CODE_QUALITY_THRESHOLD_CRITICAL_MET,
    CODE_QUALITY_THRESHOLD_UNIT_TEST_MET,
    CODE_QUALITY_THRESHOLD_CODE_COVERAGE_MET,
    CODE_QUALITY_THRESHOLD_BLOCKER_FOUND,
    CODE_QUALITY_THRESHOLD_CRITICAL_FOUND,
    CODE_QUALITY_THRESHOLD_UNIT_TEST_FOUND,
    CODE_QUALITY_THRESHOLD_CODE_COVERAGE_FOUND
}
