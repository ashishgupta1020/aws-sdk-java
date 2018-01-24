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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/ListGroups" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListGroupsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The path prefix for filtering the results. For example, the prefix <code>/division_abc/subdivision_xyz/</code>
     * gets all groups whose path starts with <code>/division_abc/subdivision_xyz/</code>.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, it defaults to a slash (/), listing all groups. This paramater
     * allows (per its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of characters consisting of
     * either a forward slash (/) by itself or a string that must begin and end with forward slashes, containing any
     * ASCII character from the ! (\u0021) thru the DEL character (\u007F), including most punctuation characters,
     * digits, and upper and lowercased letters.
     * </p>
     */
    private String pathPrefix;
    /**
     * <p>
     * Use this parameter only when paginating results and only after you receive a response indicating that the results
     * are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to
     * indicate where the next call should start.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * (Optional) Use this only when paginating results to indicate the maximum number of items you want in the
     * response. If additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element
     * is <code>true</code>.
     * </p>
     * <p>
     * If you do not include this parameter, it defaults to 100. Note that IAM might return fewer results, even when
     * there are more results available. In that case, the <code>IsTruncated</code> response element returns
     * <code>true</code> and <code>Marker</code> contains a value to include in the subsequent call that tells the
     * service where to continue from.
     * </p>
     */
    private Integer maxItems;

    /**
     * <p>
     * The path prefix for filtering the results. For example, the prefix <code>/division_abc/subdivision_xyz/</code>
     * gets all groups whose path starts with <code>/division_abc/subdivision_xyz/</code>.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, it defaults to a slash (/), listing all groups. This paramater
     * allows (per its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of characters consisting of
     * either a forward slash (/) by itself or a string that must begin and end with forward slashes, containing any
     * ASCII character from the ! (\u0021) thru the DEL character (\u007F), including most punctuation characters,
     * digits, and upper and lowercased letters.
     * </p>
     * 
     * @param pathPrefix
     *        The path prefix for filtering the results. For example, the prefix
     *        <code>/division_abc/subdivision_xyz/</code> gets all groups whose path starts with
     *        <code>/division_abc/subdivision_xyz/</code>.</p>
     *        <p>
     *        This parameter is optional. If it is not included, it defaults to a slash (/), listing all groups. This
     *        paramater allows (per its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     *        characters consisting of either a forward slash (/) by itself or a string that must begin and end with
     *        forward slashes, containing any ASCII character from the ! (\u0021) thru the DEL character (\u007F),
     *        including most punctuation characters, digits, and upper and lowercased letters.
     */

    public void setPathPrefix(String pathPrefix) {
        this.pathPrefix = pathPrefix;
    }

    /**
     * <p>
     * The path prefix for filtering the results. For example, the prefix <code>/division_abc/subdivision_xyz/</code>
     * gets all groups whose path starts with <code>/division_abc/subdivision_xyz/</code>.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, it defaults to a slash (/), listing all groups. This paramater
     * allows (per its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of characters consisting of
     * either a forward slash (/) by itself or a string that must begin and end with forward slashes, containing any
     * ASCII character from the ! (\u0021) thru the DEL character (\u007F), including most punctuation characters,
     * digits, and upper and lowercased letters.
     * </p>
     * 
     * @return The path prefix for filtering the results. For example, the prefix
     *         <code>/division_abc/subdivision_xyz/</code> gets all groups whose path starts with
     *         <code>/division_abc/subdivision_xyz/</code>.</p>
     *         <p>
     *         This parameter is optional. If it is not included, it defaults to a slash (/), listing all groups. This
     *         paramater allows (per its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     *         characters consisting of either a forward slash (/) by itself or a string that must begin and end with
     *         forward slashes, containing any ASCII character from the ! (\u0021) thru the DEL character (\u007F),
     *         including most punctuation characters, digits, and upper and lowercased letters.
     */

    public String getPathPrefix() {
        return this.pathPrefix;
    }

    /**
     * <p>
     * The path prefix for filtering the results. For example, the prefix <code>/division_abc/subdivision_xyz/</code>
     * gets all groups whose path starts with <code>/division_abc/subdivision_xyz/</code>.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, it defaults to a slash (/), listing all groups. This paramater
     * allows (per its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of characters consisting of
     * either a forward slash (/) by itself or a string that must begin and end with forward slashes, containing any
     * ASCII character from the ! (\u0021) thru the DEL character (\u007F), including most punctuation characters,
     * digits, and upper and lowercased letters.
     * </p>
     * 
     * @param pathPrefix
     *        The path prefix for filtering the results. For example, the prefix
     *        <code>/division_abc/subdivision_xyz/</code> gets all groups whose path starts with
     *        <code>/division_abc/subdivision_xyz/</code>.</p>
     *        <p>
     *        This parameter is optional. If it is not included, it defaults to a slash (/), listing all groups. This
     *        paramater allows (per its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     *        characters consisting of either a forward slash (/) by itself or a string that must begin and end with
     *        forward slashes, containing any ASCII character from the ! (\u0021) thru the DEL character (\u007F),
     *        including most punctuation characters, digits, and upper and lowercased letters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupsRequest withPathPrefix(String pathPrefix) {
        setPathPrefix(pathPrefix);
        return this;
    }

    /**
     * <p>
     * Use this parameter only when paginating results and only after you receive a response indicating that the results
     * are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to
     * indicate where the next call should start.
     * </p>
     * 
     * @param marker
     *        Use this parameter only when paginating results and only after you receive a response indicating that the
     *        results are truncated. Set it to the value of the <code>Marker</code> element in the response that you
     *        received to indicate where the next call should start.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * Use this parameter only when paginating results and only after you receive a response indicating that the results
     * are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to
     * indicate where the next call should start.
     * </p>
     * 
     * @return Use this parameter only when paginating results and only after you receive a response indicating that the
     *         results are truncated. Set it to the value of the <code>Marker</code> element in the response that you
     *         received to indicate where the next call should start.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * Use this parameter only when paginating results and only after you receive a response indicating that the results
     * are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to
     * indicate where the next call should start.
     * </p>
     * 
     * @param marker
     *        Use this parameter only when paginating results and only after you receive a response indicating that the
     *        results are truncated. Set it to the value of the <code>Marker</code> element in the response that you
     *        received to indicate where the next call should start.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupsRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * (Optional) Use this only when paginating results to indicate the maximum number of items you want in the
     * response. If additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element
     * is <code>true</code>.
     * </p>
     * <p>
     * If you do not include this parameter, it defaults to 100. Note that IAM might return fewer results, even when
     * there are more results available. In that case, the <code>IsTruncated</code> response element returns
     * <code>true</code> and <code>Marker</code> contains a value to include in the subsequent call that tells the
     * service where to continue from.
     * </p>
     * 
     * @param maxItems
     *        (Optional) Use this only when paginating results to indicate the maximum number of items you want in the
     *        response. If additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response
     *        element is <code>true</code>.</p>
     *        <p>
     *        If you do not include this parameter, it defaults to 100. Note that IAM might return fewer results, even
     *        when there are more results available. In that case, the <code>IsTruncated</code> response element returns
     *        <code>true</code> and <code>Marker</code> contains a value to include in the subsequent call that tells
     *        the service where to continue from.
     */

    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * (Optional) Use this only when paginating results to indicate the maximum number of items you want in the
     * response. If additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element
     * is <code>true</code>.
     * </p>
     * <p>
     * If you do not include this parameter, it defaults to 100. Note that IAM might return fewer results, even when
     * there are more results available. In that case, the <code>IsTruncated</code> response element returns
     * <code>true</code> and <code>Marker</code> contains a value to include in the subsequent call that tells the
     * service where to continue from.
     * </p>
     * 
     * @return (Optional) Use this only when paginating results to indicate the maximum number of items you want in the
     *         response. If additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response
     *         element is <code>true</code>.</p>
     *         <p>
     *         If you do not include this parameter, it defaults to 100. Note that IAM might return fewer results, even
     *         when there are more results available. In that case, the <code>IsTruncated</code> response element
     *         returns <code>true</code> and <code>Marker</code> contains a value to include in the subsequent call that
     *         tells the service where to continue from.
     */

    public Integer getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * (Optional) Use this only when paginating results to indicate the maximum number of items you want in the
     * response. If additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element
     * is <code>true</code>.
     * </p>
     * <p>
     * If you do not include this parameter, it defaults to 100. Note that IAM might return fewer results, even when
     * there are more results available. In that case, the <code>IsTruncated</code> response element returns
     * <code>true</code> and <code>Marker</code> contains a value to include in the subsequent call that tells the
     * service where to continue from.
     * </p>
     * 
     * @param maxItems
     *        (Optional) Use this only when paginating results to indicate the maximum number of items you want in the
     *        response. If additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response
     *        element is <code>true</code>.</p>
     *        <p>
     *        If you do not include this parameter, it defaults to 100. Note that IAM might return fewer results, even
     *        when there are more results available. In that case, the <code>IsTruncated</code> response element returns
     *        <code>true</code> and <code>Marker</code> contains a value to include in the subsequent call that tells
     *        the service where to continue from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupsRequest withMaxItems(Integer maxItems) {
        setMaxItems(maxItems);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPathPrefix() != null)
            sb.append("PathPrefix: ").append(getPathPrefix()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getMaxItems() != null)
            sb.append("MaxItems: ").append(getMaxItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListGroupsRequest == false)
            return false;
        ListGroupsRequest other = (ListGroupsRequest) obj;
        if (other.getPathPrefix() == null ^ this.getPathPrefix() == null)
            return false;
        if (other.getPathPrefix() != null && other.getPathPrefix().equals(this.getPathPrefix()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPathPrefix() == null) ? 0 : getPathPrefix().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public ListGroupsRequest clone() {
        return (ListGroupsRequest) super.clone();
    }

}
