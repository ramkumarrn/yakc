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

package com.marcnuri.yakc.model.dev.knative.sources.v1alpha1;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.marcnuri.yakc.model.Model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 
 */
@SuppressWarnings({"squid:S1192", "WeakerAccess", "unused"})
@Builder(toBuilder = true, builderClassName = "Builder")
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class ApiServerSourceSpecResources implements Model {


  /**
   * API version of the resource to watch.
   */
  @JsonProperty("apiVersion")
  private String apiVersion;

  /**
   * If true, send an event referencing the object controlling the resource Deprecated: Per-resource controller flag will no longer be supported in v1alpha2, please use Spec.Owner as a GKV.
   */
  @JsonProperty("controller")
  private Boolean controller;

  @JsonProperty("controllerSelector")
  private ApiServerSourceSpecControllerSelector controllerSelector;

  /**
   * Kind of the resource to watch. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  @JsonProperty("kind")
  private String kind;

  @JsonProperty("labelSelector")
  private ApiServerSourceSpecLabelSelector labelSelector;

}
