package com.twodevsstudio.simplejsonconfig.data;

import com.twodevsstudio.simplejsonconfig.def.StoreType;
import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Stored {

  /** Directory name for this stored type. */
  String value();

  /**
   * You can specify a path to your storage directory
   *
   * @implNote Child path, starting from the plugins folder, example: "/simplejsonconfig", if not
   *     specified it will be the default to directory set in SimpleJSONConfig initializing
   *     (SimpleJSONConfig.INSTANCE.register)
   */
  String configPath() default "";

  StoreType storeType() default StoreType.JSON;

  long cacheLifespanSeconds() default -1;

  long cacheScanIntervalSeconds() default 120L;

  int cacheMaxSize() default Integer.MAX_VALUE;
}
