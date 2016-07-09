/**
 * Copyright (C) 2016 Jeremy Custenborder (jcustenborder@gmail.com)
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.confluent.kafka.connect.utils.config;

import com.google.common.collect.ImmutableMap;
import org.junit.Test;

public class ConfigUtilsTests {

  @Test
  public void getClassValid() {
    ConfigUtilsTestConfig config = new ConfigUtilsTestConfig(ImmutableMap.of());
    Class<ConfigUtilsTestInterface> actual = ConfigUtils.getClass(config, ConfigUtilsTestConfig.TEST_CLASS_CONF, ConfigUtilsTestInterface.class);
  }

  @Test(expected = IllegalStateException.class)
  public void getClassInValid() {
    ConfigUtilsTestConfig config = new ConfigUtilsTestConfig(ImmutableMap.of());
    Class<String> actual = ConfigUtils.getClass(config, ConfigUtilsTestConfig.TEST_CLASS_CONF, String.class);
  }

}
