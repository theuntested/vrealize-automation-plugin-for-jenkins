/*
 * Copyright (c) 2020 VMware, Inc
 *
 *  SPDX-License-Identifier: MIT
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

/*
 * VMware Cloud Assembly IaaS API
 * A multi-cloud IaaS API for Cloud Automation Services
 *
 * OpenAPI spec version: 2019-01-15
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.vmware.vra.jenkinsplugin.model.iaas;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

/** Represents fabric flavor instance type description. Used when creating flavor profiles. */
@Schema(
    description =
        "Represents fabric flavor instance type description. Used when creating flavor profiles.")
@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
    date = "2020-09-09T18:26:35.661905-04:00[America/New_York]")
public class FabricFlavorDescription {
  @SerializedName("memoryInMB")
  private Long memoryInMB = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("cpuCount")
  private Integer cpuCount = null;

  public FabricFlavorDescription memoryInMB(Long memoryInMB) {
    this.memoryInMB = memoryInMB;
    return this;
  }

  /**
   * Total amount of memory (in megabytes). Mandatory for private clouds such as vSphere. Not
   * populated when inapplicable.
   *
   * @return memoryInMB
   */
  @Schema(
      example = "4096",
      description =
          "Total amount of memory (in megabytes). Mandatory for private clouds such as vSphere. Not populated when inapplicable.")
  public Long getMemoryInMB() {
    return memoryInMB;
  }

  public void setMemoryInMB(Long memoryInMB) {
    this.memoryInMB = memoryInMB;
  }

  public FabricFlavorDescription name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The value of the instance type in the corresponding cloud. Valid and mandatory for public
   * clouds
   *
   * @return name
   */
  @Schema(
      example = "t2.small, t2.medium",
      description =
          "The value of the instance type in the corresponding cloud. Valid and mandatory for public clouds")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FabricFlavorDescription cpuCount(Integer cpuCount) {
    this.cpuCount = cpuCount;
    return this;
  }

  /**
   * Number of CPU cores. Mandatory for private clouds such as vSphere. Not populated when
   * inapplicable.
   *
   * @return cpuCount
   */
  @Schema(
      example = "4",
      description =
          "Number of CPU cores. Mandatory for private clouds such as vSphere. Not populated when inapplicable.")
  public Integer getCpuCount() {
    return cpuCount;
  }

  public void setCpuCount(Integer cpuCount) {
    this.cpuCount = cpuCount;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FabricFlavorDescription fabricFlavorDescription = (FabricFlavorDescription) o;
    return Objects.equals(this.memoryInMB, fabricFlavorDescription.memoryInMB)
        && Objects.equals(this.name, fabricFlavorDescription.name)
        && Objects.equals(this.cpuCount, fabricFlavorDescription.cpuCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memoryInMB, name, cpuCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FabricFlavorDescription {\n");

    sb.append("    memoryInMB: ").append(toIndentedString(memoryInMB)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    cpuCount: ").append(toIndentedString(cpuCount)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}