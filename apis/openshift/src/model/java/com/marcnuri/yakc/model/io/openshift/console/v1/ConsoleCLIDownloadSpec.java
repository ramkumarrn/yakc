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

package com.marcnuri.yakc.model.io.openshift.console.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.marcnuri.yakc.model.Model;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Singular;
import lombok.ToString;

/**
 * ConsoleCLIDownloadSpec is the desired cli download configuration.
 */
@SuppressWarnings({"squid:S1192", "WeakerAccess", "unused"})
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class ConsoleCLIDownloadSpec implements Model {


  /**
   * description is the description of the CLI download (can include markdown).
   */
  @NonNull
  @JsonProperty("description")
  private String description;

  /**
   * displayName is the display name of the CLI download.
   */
  @NonNull
  @JsonProperty("displayName")
  private String displayName;

  /**
   * links is a list of objects that provide CLI download link details.
   */
  @NonNull
  @JsonProperty("links")
  @Singular(value = "addToLinks", ignoreNullCollections = true)
  private List<ConsoleCLIDownloadSpecLinks> links;

}
