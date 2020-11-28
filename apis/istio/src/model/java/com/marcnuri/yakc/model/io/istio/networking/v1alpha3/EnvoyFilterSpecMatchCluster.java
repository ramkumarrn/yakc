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

package com.marcnuri.yakc.model.io.istio.networking.v1alpha3;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.marcnuri.yakc.model.Model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Match on envoy cluster attributes.
 */
@SuppressWarnings({"squid:S1192", "WeakerAccess", "unused"})
@Builder(toBuilder = true, builderClassName = "Builder")
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class EnvoyFilterSpecMatchCluster implements Model {


  /**
   * The exact name of the cluster to match.
   */
  @JsonProperty("name")
  private String name;

  /**
   * The service port for which this cluster was generated.
   */
  @JsonProperty("portNumber")
  private Number portNumber;

  /**
   * The fully qualified service name for this cluster.
   */
  @JsonProperty("service")
  private String service;

  /**
   * The subset associated with the service.
   */
  @JsonProperty("subset")
  private String subset;

}
