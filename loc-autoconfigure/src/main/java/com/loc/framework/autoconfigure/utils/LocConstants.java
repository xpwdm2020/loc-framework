package com.loc.framework.autoconfigure.utils;

/**
 * Created on 2018/3/29.
 */
public interface LocConstants {

  String LOCAL_PROFILE = "local";
  String DEV_PROFILE = "dev";
  String TEST_PROFILE = "test";
  String PRO_PROFILE = "pro";

  int SUCCESS_RESPONSE_CODE = 0;
  int CONSTRAINT_VIOLATION_ERROR_CODE = 1000;
  int BIND_ERROR_CODE = 1001;
  int METHOD_ARGUMENT_NOT_VALID_ERROR_CODE = 1002;

}
