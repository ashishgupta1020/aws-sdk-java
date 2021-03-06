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
package com.amazonaws.services.iot1clickprojects.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/ListPlacements" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPlacementsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An object listing the requested placements.
     * </p>
     */
    private java.util.List<PlacementSummary> placements;
    /**
     * <p>
     * The token used to retrieve the next set of results - will be effectively empty if there are no further results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An object listing the requested placements.
     * </p>
     * 
     * @return An object listing the requested placements.
     */

    public java.util.List<PlacementSummary> getPlacements() {
        return placements;
    }

    /**
     * <p>
     * An object listing the requested placements.
     * </p>
     * 
     * @param placements
     *        An object listing the requested placements.
     */

    public void setPlacements(java.util.Collection<PlacementSummary> placements) {
        if (placements == null) {
            this.placements = null;
            return;
        }

        this.placements = new java.util.ArrayList<PlacementSummary>(placements);
    }

    /**
     * <p>
     * An object listing the requested placements.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPlacements(java.util.Collection)} or {@link #withPlacements(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param placements
     *        An object listing the requested placements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPlacementsResult withPlacements(PlacementSummary... placements) {
        if (this.placements == null) {
            setPlacements(new java.util.ArrayList<PlacementSummary>(placements.length));
        }
        for (PlacementSummary ele : placements) {
            this.placements.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An object listing the requested placements.
     * </p>
     * 
     * @param placements
     *        An object listing the requested placements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPlacementsResult withPlacements(java.util.Collection<PlacementSummary> placements) {
        setPlacements(placements);
        return this;
    }

    /**
     * <p>
     * The token used to retrieve the next set of results - will be effectively empty if there are no further results.
     * </p>
     * 
     * @param nextToken
     *        The token used to retrieve the next set of results - will be effectively empty if there are no further
     *        results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token used to retrieve the next set of results - will be effectively empty if there are no further results.
     * </p>
     * 
     * @return The token used to retrieve the next set of results - will be effectively empty if there are no further
     *         results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token used to retrieve the next set of results - will be effectively empty if there are no further results.
     * </p>
     * 
     * @param nextToken
     *        The token used to retrieve the next set of results - will be effectively empty if there are no further
     *        results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPlacementsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getPlacements() != null)
            sb.append("Placements: ").append(getPlacements()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPlacementsResult == false)
            return false;
        ListPlacementsResult other = (ListPlacementsResult) obj;
        if (other.getPlacements() == null ^ this.getPlacements() == null)
            return false;
        if (other.getPlacements() != null && other.getPlacements().equals(this.getPlacements()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPlacements() == null) ? 0 : getPlacements().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListPlacementsResult clone() {
        try {
            return (ListPlacementsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
