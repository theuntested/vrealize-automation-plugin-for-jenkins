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
 * VMware Service Broker API
 * A multi-cloud API for Cloud Automation Services
 *
 * OpenAPI spec version: 2020-08-25
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.vmware.vra.jenkinsplugin.model.catalog;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/** A decision made to enforce policies. */
@Schema(description = "A decision made to enforce policies.")
@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
    date = "2020-09-09T18:27:41.063635-04:00[America/New_York]")
public class PolicyDecisionOfObjectNode {
  @SerializedName("description")
  private String description = null;

  @SerializedName("dryRunId")
  private UUID dryRunId = null;

  @SerializedName("dryRunSubTaskId")
  private UUID dryRunSubTaskId = null;

  @SerializedName("effectivePolicyDefinition")
  private Object effectivePolicyDefinition = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("orgId")
  private String orgId = null;

  @SerializedName("policies")
  private List<PolicyDecisionPolicy> policies = null;

  @SerializedName("projectId")
  private String projectId = null;

  @SerializedName("targetId")
  private String targetId = null;

  @SerializedName("targetName")
  private String targetName = null;

  @SerializedName("timestamp")
  private Date timestamp = null;

  @SerializedName("typeId")
  private String typeId = null;

  public PolicyDecisionOfObjectNode description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   *
   * @return description
   */
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PolicyDecisionOfObjectNode dryRunId(UUID dryRunId) {
    this.dryRunId = dryRunId;
    return this;
  }

  /**
   * Get dryRunId
   *
   * @return dryRunId
   */
  @Schema(description = "")
  public UUID getDryRunId() {
    return dryRunId;
  }

  public void setDryRunId(UUID dryRunId) {
    this.dryRunId = dryRunId;
  }

  public PolicyDecisionOfObjectNode dryRunSubTaskId(UUID dryRunSubTaskId) {
    this.dryRunSubTaskId = dryRunSubTaskId;
    return this;
  }

  /**
   * Get dryRunSubTaskId
   *
   * @return dryRunSubTaskId
   */
  @Schema(description = "")
  public UUID getDryRunSubTaskId() {
    return dryRunSubTaskId;
  }

  public void setDryRunSubTaskId(UUID dryRunSubTaskId) {
    this.dryRunSubTaskId = dryRunSubTaskId;
  }

  public PolicyDecisionOfObjectNode effectivePolicyDefinition(Object effectivePolicyDefinition) {
    this.effectivePolicyDefinition = effectivePolicyDefinition;
    return this;
  }

  /**
   * Get effectivePolicyDefinition
   *
   * @return effectivePolicyDefinition
   */
  @Schema(description = "")
  public Object getEffectivePolicyDefinition() {
    return effectivePolicyDefinition;
  }

  public void setEffectivePolicyDefinition(Object effectivePolicyDefinition) {
    this.effectivePolicyDefinition = effectivePolicyDefinition;
  }

  public PolicyDecisionOfObjectNode id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   *
   * @return id
   */
  @Schema(description = "")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public PolicyDecisionOfObjectNode orgId(String orgId) {
    this.orgId = orgId;
    return this;
  }

  /**
   * Get orgId
   *
   * @return orgId
   */
  @Schema(description = "")
  public String getOrgId() {
    return orgId;
  }

  public void setOrgId(String orgId) {
    this.orgId = orgId;
  }

  public PolicyDecisionOfObjectNode policies(List<PolicyDecisionPolicy> policies) {
    this.policies = policies;
    return this;
  }

  public PolicyDecisionOfObjectNode addPoliciesItem(PolicyDecisionPolicy policiesItem) {
    if (this.policies == null) {
      this.policies = new ArrayList<PolicyDecisionPolicy>();
    }
    this.policies.add(policiesItem);
    return this;
  }

  /**
   * Get policies
   *
   * @return policies
   */
  @Schema(description = "")
  public List<PolicyDecisionPolicy> getPolicies() {
    return policies;
  }

  public void setPolicies(List<PolicyDecisionPolicy> policies) {
    this.policies = policies;
  }

  public PolicyDecisionOfObjectNode projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * Get projectId
   *
   * @return projectId
   */
  @Schema(description = "")
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public PolicyDecisionOfObjectNode targetId(String targetId) {
    this.targetId = targetId;
    return this;
  }

  /**
   * Get targetId
   *
   * @return targetId
   */
  @Schema(description = "")
  public String getTargetId() {
    return targetId;
  }

  public void setTargetId(String targetId) {
    this.targetId = targetId;
  }

  public PolicyDecisionOfObjectNode targetName(String targetName) {
    this.targetName = targetName;
    return this;
  }

  /**
   * Get targetName
   *
   * @return targetName
   */
  @Schema(description = "")
  public String getTargetName() {
    return targetName;
  }

  public void setTargetName(String targetName) {
    this.targetName = targetName;
  }

  public PolicyDecisionOfObjectNode timestamp(Date timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   *
   * @return timestamp
   */
  @Schema(description = "")
  public Date getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  public PolicyDecisionOfObjectNode typeId(String typeId) {
    this.typeId = typeId;
    return this;
  }

  /**
   * Get typeId
   *
   * @return typeId
   */
  @Schema(description = "")
  public String getTypeId() {
    return typeId;
  }

  public void setTypeId(String typeId) {
    this.typeId = typeId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolicyDecisionOfObjectNode policyDecisionOfObjectNode = (PolicyDecisionOfObjectNode) o;
    return Objects.equals(this.description, policyDecisionOfObjectNode.description)
        && Objects.equals(this.dryRunId, policyDecisionOfObjectNode.dryRunId)
        && Objects.equals(this.dryRunSubTaskId, policyDecisionOfObjectNode.dryRunSubTaskId)
        && Objects.equals(
            this.effectivePolicyDefinition, policyDecisionOfObjectNode.effectivePolicyDefinition)
        && Objects.equals(this.id, policyDecisionOfObjectNode.id)
        && Objects.equals(this.orgId, policyDecisionOfObjectNode.orgId)
        && Objects.equals(this.policies, policyDecisionOfObjectNode.policies)
        && Objects.equals(this.projectId, policyDecisionOfObjectNode.projectId)
        && Objects.equals(this.targetId, policyDecisionOfObjectNode.targetId)
        && Objects.equals(this.targetName, policyDecisionOfObjectNode.targetName)
        && Objects.equals(this.timestamp, policyDecisionOfObjectNode.timestamp)
        && Objects.equals(this.typeId, policyDecisionOfObjectNode.typeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        description,
        dryRunId,
        dryRunSubTaskId,
        effectivePolicyDefinition,
        id,
        orgId,
        policies,
        projectId,
        targetId,
        targetName,
        timestamp,
        typeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyDecisionOfObjectNode {\n");

    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dryRunId: ").append(toIndentedString(dryRunId)).append("\n");
    sb.append("    dryRunSubTaskId: ").append(toIndentedString(dryRunSubTaskId)).append("\n");
    sb.append("    effectivePolicyDefinition: ")
        .append(toIndentedString(effectivePolicyDefinition))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    targetName: ").append(toIndentedString(targetName)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
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