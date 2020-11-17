/*
 * Copyright 2020 Marc Nuri
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Created on 2020-11-11, 19:16
 */
package com.marcnuri.yack.schema;

import java.util.Map;
import java.util.function.Predicate;

/**
 * Created by Marc Nuri on 2020-11-11.
 */
public class GeneratorUtils {

  private GeneratorUtils() {}

  public static Predicate<? super Map.Entry<String, ?>> filter(GeneratorSettings gs) {
    return e -> {
      for (String regex : gs.getSkipGenerationRegexes()) {
        if (e.getKey().matches(regex)){
           return false;
        }
      }
      if (gs.getIncludeGenerationRegexes().isEmpty()) {
        return true;
      }
      for (String regex : gs.getIncludeGenerationRegexes()) {
        if (e.getKey().matches(regex)){
          return true;
        }
      }
      return false;
    };
  }

}