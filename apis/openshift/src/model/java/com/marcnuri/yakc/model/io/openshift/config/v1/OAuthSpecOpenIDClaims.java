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
 */

package com.marcnuri.yakc.model.io.openshift.config.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.marcnuri.yakc.model.Model;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Singular;
import lombok.ToString;

/**
 * claims mappings
 */
@SuppressWarnings({"squid:S1192", "WeakerAccess", "unused"})
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class OAuthSpecOpenIDClaims implements Model {


  /**
   * email is the list of claims whose values should be used as the email address. Optional. If unspecified, no email is set for the identity
   */
  @JsonProperty("email")
  @Singular(value = "addToEmail", ignoreNullCollections = true)
  private List<String> email;

  /**
   * name is the list of claims whose values should be used as the display name. Optional. If unspecified, no display name is set for the identity
   */
  @JsonProperty("name")
  @Singular(value = "addToName", ignoreNullCollections = true)
  private List<String> name;

  /**
   * preferredUsername is the list of claims whose values should be used as the preferred username. If unspecified, the preferred username is determined from the value of the sub claim
   */
  @JsonProperty("preferredUsername")
  @Singular(value = "addToPreferredUsername", ignoreNullCollections = true)
  private List<String> preferredUsername;

}
