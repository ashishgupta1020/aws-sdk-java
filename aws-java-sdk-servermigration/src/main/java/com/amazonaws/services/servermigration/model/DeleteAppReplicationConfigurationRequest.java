/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.servermigration.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/DeleteAppReplicationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteAppReplicationConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * ID of the application associated with the replication configuration.
     * </p>
     */
    private String appId;

    /**
     * <p>
     * ID of the application associated with the replication configuration.
     * </p>
     * 
     * @param appId
     *        ID of the application associated with the replication configuration.
     */

    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * <p>
     * ID of the application associated with the replication configuration.
     * </p>
     * 
     * @return ID of the application associated with the replication configuration.
     */

    public String getAppId() {
        return this.appId;
    }

    /**
     * <p>
     * ID of the application associated with the replication configuration.
     * </p>
     * 
     * @param appId
     *        ID of the application associated with the replication configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAppReplicationConfigurationRequest withAppId(String appId) {
        setAppId(appId);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAppId() != null)
            sb.append("AppId: ").append(getAppId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAppReplicationConfigurationRequest == false)
            return false;
        DeleteAppReplicationConfigurationRequest other = (DeleteAppReplicationConfigurationRequest) obj;
        if (other.getAppId() == null ^ this.getAppId() == null)
            return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteAppReplicationConfigurationRequest clone() {
        return (DeleteAppReplicationConfigurationRequest) super.clone();
    }

}
