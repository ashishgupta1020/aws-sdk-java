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
package com.amazonaws.services.mediapackage.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediapackage.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MssPackageMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MssPackageMarshaller {

    private static final MarshallingInfo<StructuredPojo> ENCRYPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("encryption").build();
    private static final MarshallingInfo<Integer> MANIFESTWINDOWSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("manifestWindowSeconds").build();
    private static final MarshallingInfo<Integer> SEGMENTDURATIONSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("segmentDurationSeconds").build();
    private static final MarshallingInfo<StructuredPojo> STREAMSELECTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("streamSelection").build();

    private static final MssPackageMarshaller instance = new MssPackageMarshaller();

    public static MssPackageMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MssPackage mssPackage, ProtocolMarshaller protocolMarshaller) {

        if (mssPackage == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(mssPackage.getEncryption(), ENCRYPTION_BINDING);
            protocolMarshaller.marshall(mssPackage.getManifestWindowSeconds(), MANIFESTWINDOWSECONDS_BINDING);
            protocolMarshaller.marshall(mssPackage.getSegmentDurationSeconds(), SEGMENTDURATIONSECONDS_BINDING);
            protocolMarshaller.marshall(mssPackage.getStreamSelection(), STREAMSELECTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
