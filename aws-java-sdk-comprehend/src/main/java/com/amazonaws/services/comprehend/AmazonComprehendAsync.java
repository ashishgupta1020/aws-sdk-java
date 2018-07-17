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
package com.amazonaws.services.comprehend;

import javax.annotation.Generated;

import com.amazonaws.services.comprehend.model.*;

/**
 * Interface for accessing Amazon Comprehend asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.comprehend.AbstractAmazonComprehendAsync} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Comprehend is an AWS service for gaining insight into the content of documents. Use these actions to determine
 * the topics contained in your documents, the topics they discuss, the predominant sentiment expressed in them, the
 * predominant language used, and more.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonComprehendAsync extends AmazonComprehend {

    /**
     * <p>
     * Determines the dominant language of the input text for a batch of documents. For a list of languages that Amazon
     * Comprehend can detect, see <a href="http://docs.aws.amazon.com/comprehend/latest/dg/how-languages.html">Amazon
     * Comprehend Supported Languages</a>.
     * </p>
     * 
     * @param batchDetectDominantLanguageRequest
     * @return A Java Future containing the result of the BatchDetectDominantLanguage operation returned by the service.
     * @sample AmazonComprehendAsync.BatchDetectDominantLanguage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/BatchDetectDominantLanguage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchDetectDominantLanguageResult> batchDetectDominantLanguageAsync(
            BatchDetectDominantLanguageRequest batchDetectDominantLanguageRequest);

    /**
     * <p>
     * Determines the dominant language of the input text for a batch of documents. For a list of languages that Amazon
     * Comprehend can detect, see <a href="http://docs.aws.amazon.com/comprehend/latest/dg/how-languages.html">Amazon
     * Comprehend Supported Languages</a>.
     * </p>
     * 
     * @param batchDetectDominantLanguageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchDetectDominantLanguage operation returned by the service.
     * @sample AmazonComprehendAsyncHandler.BatchDetectDominantLanguage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/BatchDetectDominantLanguage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchDetectDominantLanguageResult> batchDetectDominantLanguageAsync(
            BatchDetectDominantLanguageRequest batchDetectDominantLanguageRequest,
            com.amazonaws.handlers.AsyncHandler<BatchDetectDominantLanguageRequest, BatchDetectDominantLanguageResult> asyncHandler);

    /**
     * <p>
     * Inspects the text of a batch of documents for named entities and returns information about them. For more
     * information about named entities, see <a>how-entities</a>
     * </p>
     * 
     * @param batchDetectEntitiesRequest
     * @return A Java Future containing the result of the BatchDetectEntities operation returned by the service.
     * @sample AmazonComprehendAsync.BatchDetectEntities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/BatchDetectEntities" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<BatchDetectEntitiesResult> batchDetectEntitiesAsync(BatchDetectEntitiesRequest batchDetectEntitiesRequest);

    /**
     * <p>
     * Inspects the text of a batch of documents for named entities and returns information about them. For more
     * information about named entities, see <a>how-entities</a>
     * </p>
     * 
     * @param batchDetectEntitiesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchDetectEntities operation returned by the service.
     * @sample AmazonComprehendAsyncHandler.BatchDetectEntities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/BatchDetectEntities" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<BatchDetectEntitiesResult> batchDetectEntitiesAsync(BatchDetectEntitiesRequest batchDetectEntitiesRequest,
            com.amazonaws.handlers.AsyncHandler<BatchDetectEntitiesRequest, BatchDetectEntitiesResult> asyncHandler);

    /**
     * <p>
     * Detects the key noun phrases found in a batch of documents.
     * </p>
     * 
     * @param batchDetectKeyPhrasesRequest
     * @return A Java Future containing the result of the BatchDetectKeyPhrases operation returned by the service.
     * @sample AmazonComprehendAsync.BatchDetectKeyPhrases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/BatchDetectKeyPhrases"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchDetectKeyPhrasesResult> batchDetectKeyPhrasesAsync(BatchDetectKeyPhrasesRequest batchDetectKeyPhrasesRequest);

    /**
     * <p>
     * Detects the key noun phrases found in a batch of documents.
     * </p>
     * 
     * @param batchDetectKeyPhrasesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchDetectKeyPhrases operation returned by the service.
     * @sample AmazonComprehendAsyncHandler.BatchDetectKeyPhrases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/BatchDetectKeyPhrases"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchDetectKeyPhrasesResult> batchDetectKeyPhrasesAsync(BatchDetectKeyPhrasesRequest batchDetectKeyPhrasesRequest,
            com.amazonaws.handlers.AsyncHandler<BatchDetectKeyPhrasesRequest, BatchDetectKeyPhrasesResult> asyncHandler);

    /**
     * <p>
     * Inspects a batch of documents and returns an inference of the prevailing sentiment, <code>POSITIVE</code>,
     * <code>NEUTRAL</code>, <code>MIXED</code>, or <code>NEGATIVE</code>, in each one.
     * </p>
     * 
     * @param batchDetectSentimentRequest
     * @return A Java Future containing the result of the BatchDetectSentiment operation returned by the service.
     * @sample AmazonComprehendAsync.BatchDetectSentiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/BatchDetectSentiment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchDetectSentimentResult> batchDetectSentimentAsync(BatchDetectSentimentRequest batchDetectSentimentRequest);

    /**
     * <p>
     * Inspects a batch of documents and returns an inference of the prevailing sentiment, <code>POSITIVE</code>,
     * <code>NEUTRAL</code>, <code>MIXED</code>, or <code>NEGATIVE</code>, in each one.
     * </p>
     * 
     * @param batchDetectSentimentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchDetectSentiment operation returned by the service.
     * @sample AmazonComprehendAsyncHandler.BatchDetectSentiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/BatchDetectSentiment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchDetectSentimentResult> batchDetectSentimentAsync(BatchDetectSentimentRequest batchDetectSentimentRequest,
            com.amazonaws.handlers.AsyncHandler<BatchDetectSentimentRequest, BatchDetectSentimentResult> asyncHandler);

    /**
     * <p>
     * Inspects the text of a batch of documents for the syntax and part of speech of the words in the document and
     * returns information about them. For more information, see <a>how-syntax</a>.
     * </p>
     * 
     * @param batchDetectSyntaxRequest
     * @return A Java Future containing the result of the BatchDetectSyntax operation returned by the service.
     * @sample AmazonComprehendAsync.BatchDetectSyntax
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/BatchDetectSyntax" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<BatchDetectSyntaxResult> batchDetectSyntaxAsync(BatchDetectSyntaxRequest batchDetectSyntaxRequest);

    /**
     * <p>
     * Inspects the text of a batch of documents for the syntax and part of speech of the words in the document and
     * returns information about them. For more information, see <a>how-syntax</a>.
     * </p>
     * 
     * @param batchDetectSyntaxRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchDetectSyntax operation returned by the service.
     * @sample AmazonComprehendAsyncHandler.BatchDetectSyntax
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/BatchDetectSyntax" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<BatchDetectSyntaxResult> batchDetectSyntaxAsync(BatchDetectSyntaxRequest batchDetectSyntaxRequest,
            com.amazonaws.handlers.AsyncHandler<BatchDetectSyntaxRequest, BatchDetectSyntaxResult> asyncHandler);

    /**
     * <p>
     * Gets the properties associated with a dominant language detection job. Use this operation to get the status of a
     * detection job.
     * </p>
     * 
     * @param describeDominantLanguageDetectionJobRequest
     * @return A Java Future containing the result of the DescribeDominantLanguageDetectionJob operation returned by the
     *         service.
     * @sample AmazonComprehendAsync.DescribeDominantLanguageDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DescribeDominantLanguageDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDominantLanguageDetectionJobResult> describeDominantLanguageDetectionJobAsync(
            DescribeDominantLanguageDetectionJobRequest describeDominantLanguageDetectionJobRequest);

    /**
     * <p>
     * Gets the properties associated with a dominant language detection job. Use this operation to get the status of a
     * detection job.
     * </p>
     * 
     * @param describeDominantLanguageDetectionJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDominantLanguageDetectionJob operation returned by the
     *         service.
     * @sample AmazonComprehendAsyncHandler.DescribeDominantLanguageDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DescribeDominantLanguageDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDominantLanguageDetectionJobResult> describeDominantLanguageDetectionJobAsync(
            DescribeDominantLanguageDetectionJobRequest describeDominantLanguageDetectionJobRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDominantLanguageDetectionJobRequest, DescribeDominantLanguageDetectionJobResult> asyncHandler);

    /**
     * <p>
     * Gets the properties associated with an entities detection job. Use this operation to get the status of a
     * detection job.
     * </p>
     * 
     * @param describeEntitiesDetectionJobRequest
     * @return A Java Future containing the result of the DescribeEntitiesDetectionJob operation returned by the
     *         service.
     * @sample AmazonComprehendAsync.DescribeEntitiesDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DescribeEntitiesDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEntitiesDetectionJobResult> describeEntitiesDetectionJobAsync(
            DescribeEntitiesDetectionJobRequest describeEntitiesDetectionJobRequest);

    /**
     * <p>
     * Gets the properties associated with an entities detection job. Use this operation to get the status of a
     * detection job.
     * </p>
     * 
     * @param describeEntitiesDetectionJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEntitiesDetectionJob operation returned by the
     *         service.
     * @sample AmazonComprehendAsyncHandler.DescribeEntitiesDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DescribeEntitiesDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEntitiesDetectionJobResult> describeEntitiesDetectionJobAsync(
            DescribeEntitiesDetectionJobRequest describeEntitiesDetectionJobRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEntitiesDetectionJobRequest, DescribeEntitiesDetectionJobResult> asyncHandler);

    /**
     * <p>
     * Gets the properties associated with a key phrases detection job. Use this operation to get the status of a
     * detection job.
     * </p>
     * 
     * @param describeKeyPhrasesDetectionJobRequest
     * @return A Java Future containing the result of the DescribeKeyPhrasesDetectionJob operation returned by the
     *         service.
     * @sample AmazonComprehendAsync.DescribeKeyPhrasesDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DescribeKeyPhrasesDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeKeyPhrasesDetectionJobResult> describeKeyPhrasesDetectionJobAsync(
            DescribeKeyPhrasesDetectionJobRequest describeKeyPhrasesDetectionJobRequest);

    /**
     * <p>
     * Gets the properties associated with a key phrases detection job. Use this operation to get the status of a
     * detection job.
     * </p>
     * 
     * @param describeKeyPhrasesDetectionJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeKeyPhrasesDetectionJob operation returned by the
     *         service.
     * @sample AmazonComprehendAsyncHandler.DescribeKeyPhrasesDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DescribeKeyPhrasesDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeKeyPhrasesDetectionJobResult> describeKeyPhrasesDetectionJobAsync(
            DescribeKeyPhrasesDetectionJobRequest describeKeyPhrasesDetectionJobRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeKeyPhrasesDetectionJobRequest, DescribeKeyPhrasesDetectionJobResult> asyncHandler);

    /**
     * <p>
     * Gets the properties associated with a sentiment detection job. Use this operation to get the status of a
     * detection job.
     * </p>
     * 
     * @param describeSentimentDetectionJobRequest
     * @return A Java Future containing the result of the DescribeSentimentDetectionJob operation returned by the
     *         service.
     * @sample AmazonComprehendAsync.DescribeSentimentDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DescribeSentimentDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSentimentDetectionJobResult> describeSentimentDetectionJobAsync(
            DescribeSentimentDetectionJobRequest describeSentimentDetectionJobRequest);

    /**
     * <p>
     * Gets the properties associated with a sentiment detection job. Use this operation to get the status of a
     * detection job.
     * </p>
     * 
     * @param describeSentimentDetectionJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSentimentDetectionJob operation returned by the
     *         service.
     * @sample AmazonComprehendAsyncHandler.DescribeSentimentDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DescribeSentimentDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSentimentDetectionJobResult> describeSentimentDetectionJobAsync(
            DescribeSentimentDetectionJobRequest describeSentimentDetectionJobRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSentimentDetectionJobRequest, DescribeSentimentDetectionJobResult> asyncHandler);

    /**
     * <p>
     * Gets the properties associated with a topic detection job. Use this operation to get the status of a detection
     * job.
     * </p>
     * 
     * @param describeTopicsDetectionJobRequest
     * @return A Java Future containing the result of the DescribeTopicsDetectionJob operation returned by the service.
     * @sample AmazonComprehendAsync.DescribeTopicsDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DescribeTopicsDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTopicsDetectionJobResult> describeTopicsDetectionJobAsync(
            DescribeTopicsDetectionJobRequest describeTopicsDetectionJobRequest);

    /**
     * <p>
     * Gets the properties associated with a topic detection job. Use this operation to get the status of a detection
     * job.
     * </p>
     * 
     * @param describeTopicsDetectionJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTopicsDetectionJob operation returned by the service.
     * @sample AmazonComprehendAsyncHandler.DescribeTopicsDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DescribeTopicsDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTopicsDetectionJobResult> describeTopicsDetectionJobAsync(
            DescribeTopicsDetectionJobRequest describeTopicsDetectionJobRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTopicsDetectionJobRequest, DescribeTopicsDetectionJobResult> asyncHandler);

    /**
     * <p>
     * Determines the dominant language of the input text. For a list of languages that Amazon Comprehend can detect,
     * see <a href="http://docs.aws.amazon.com/comprehend/latest/dg/how-languages.html">Amazon Comprehend Supported
     * Languages</a>.
     * </p>
     * 
     * @param detectDominantLanguageRequest
     * @return A Java Future containing the result of the DetectDominantLanguage operation returned by the service.
     * @sample AmazonComprehendAsync.DetectDominantLanguage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DetectDominantLanguage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DetectDominantLanguageResult> detectDominantLanguageAsync(DetectDominantLanguageRequest detectDominantLanguageRequest);

    /**
     * <p>
     * Determines the dominant language of the input text. For a list of languages that Amazon Comprehend can detect,
     * see <a href="http://docs.aws.amazon.com/comprehend/latest/dg/how-languages.html">Amazon Comprehend Supported
     * Languages</a>.
     * </p>
     * 
     * @param detectDominantLanguageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetectDominantLanguage operation returned by the service.
     * @sample AmazonComprehendAsyncHandler.DetectDominantLanguage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DetectDominantLanguage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DetectDominantLanguageResult> detectDominantLanguageAsync(DetectDominantLanguageRequest detectDominantLanguageRequest,
            com.amazonaws.handlers.AsyncHandler<DetectDominantLanguageRequest, DetectDominantLanguageResult> asyncHandler);

    /**
     * <p>
     * Inspects text for named entities, and returns information about them. For more information, about named entities,
     * see <a>how-entities</a>.
     * </p>
     * 
     * @param detectEntitiesRequest
     * @return A Java Future containing the result of the DetectEntities operation returned by the service.
     * @sample AmazonComprehendAsync.DetectEntities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DetectEntities" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DetectEntitiesResult> detectEntitiesAsync(DetectEntitiesRequest detectEntitiesRequest);

    /**
     * <p>
     * Inspects text for named entities, and returns information about them. For more information, about named entities,
     * see <a>how-entities</a>.
     * </p>
     * 
     * @param detectEntitiesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetectEntities operation returned by the service.
     * @sample AmazonComprehendAsyncHandler.DetectEntities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DetectEntities" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DetectEntitiesResult> detectEntitiesAsync(DetectEntitiesRequest detectEntitiesRequest,
            com.amazonaws.handlers.AsyncHandler<DetectEntitiesRequest, DetectEntitiesResult> asyncHandler);

    /**
     * <p>
     * Detects the key noun phrases found in the text.
     * </p>
     * 
     * @param detectKeyPhrasesRequest
     * @return A Java Future containing the result of the DetectKeyPhrases operation returned by the service.
     * @sample AmazonComprehendAsync.DetectKeyPhrases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DetectKeyPhrases" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DetectKeyPhrasesResult> detectKeyPhrasesAsync(DetectKeyPhrasesRequest detectKeyPhrasesRequest);

    /**
     * <p>
     * Detects the key noun phrases found in the text.
     * </p>
     * 
     * @param detectKeyPhrasesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetectKeyPhrases operation returned by the service.
     * @sample AmazonComprehendAsyncHandler.DetectKeyPhrases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DetectKeyPhrases" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DetectKeyPhrasesResult> detectKeyPhrasesAsync(DetectKeyPhrasesRequest detectKeyPhrasesRequest,
            com.amazonaws.handlers.AsyncHandler<DetectKeyPhrasesRequest, DetectKeyPhrasesResult> asyncHandler);

    /**
     * <p>
     * Inspects text and returns an inference of the prevailing sentiment (<code>POSITIVE</code>, <code>NEUTRAL</code>,
     * <code>MIXED</code>, or <code>NEGATIVE</code>).
     * </p>
     * 
     * @param detectSentimentRequest
     * @return A Java Future containing the result of the DetectSentiment operation returned by the service.
     * @sample AmazonComprehendAsync.DetectSentiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DetectSentiment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DetectSentimentResult> detectSentimentAsync(DetectSentimentRequest detectSentimentRequest);

    /**
     * <p>
     * Inspects text and returns an inference of the prevailing sentiment (<code>POSITIVE</code>, <code>NEUTRAL</code>,
     * <code>MIXED</code>, or <code>NEGATIVE</code>).
     * </p>
     * 
     * @param detectSentimentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetectSentiment operation returned by the service.
     * @sample AmazonComprehendAsyncHandler.DetectSentiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DetectSentiment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DetectSentimentResult> detectSentimentAsync(DetectSentimentRequest detectSentimentRequest,
            com.amazonaws.handlers.AsyncHandler<DetectSentimentRequest, DetectSentimentResult> asyncHandler);

    /**
     * <p>
     * Inspects text for syntax and the part of speech of words in the document. For more information,
     * <a>how-syntax</a>.
     * </p>
     * 
     * @param detectSyntaxRequest
     * @return A Java Future containing the result of the DetectSyntax operation returned by the service.
     * @sample AmazonComprehendAsync.DetectSyntax
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DetectSyntax" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DetectSyntaxResult> detectSyntaxAsync(DetectSyntaxRequest detectSyntaxRequest);

    /**
     * <p>
     * Inspects text for syntax and the part of speech of words in the document. For more information,
     * <a>how-syntax</a>.
     * </p>
     * 
     * @param detectSyntaxRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetectSyntax operation returned by the service.
     * @sample AmazonComprehendAsyncHandler.DetectSyntax
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DetectSyntax" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DetectSyntaxResult> detectSyntaxAsync(DetectSyntaxRequest detectSyntaxRequest,
            com.amazonaws.handlers.AsyncHandler<DetectSyntaxRequest, DetectSyntaxResult> asyncHandler);

    /**
     * <p>
     * Gets a list of the dominant language detection jobs that you have submitted.
     * </p>
     * 
     * @param listDominantLanguageDetectionJobsRequest
     * @return A Java Future containing the result of the ListDominantLanguageDetectionJobs operation returned by the
     *         service.
     * @sample AmazonComprehendAsync.ListDominantLanguageDetectionJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/ListDominantLanguageDetectionJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDominantLanguageDetectionJobsResult> listDominantLanguageDetectionJobsAsync(
            ListDominantLanguageDetectionJobsRequest listDominantLanguageDetectionJobsRequest);

    /**
     * <p>
     * Gets a list of the dominant language detection jobs that you have submitted.
     * </p>
     * 
     * @param listDominantLanguageDetectionJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDominantLanguageDetectionJobs operation returned by the
     *         service.
     * @sample AmazonComprehendAsyncHandler.ListDominantLanguageDetectionJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/ListDominantLanguageDetectionJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDominantLanguageDetectionJobsResult> listDominantLanguageDetectionJobsAsync(
            ListDominantLanguageDetectionJobsRequest listDominantLanguageDetectionJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDominantLanguageDetectionJobsRequest, ListDominantLanguageDetectionJobsResult> asyncHandler);

    /**
     * <p>
     * Gets a list of the entity detection jobs that you have submitted.
     * </p>
     * 
     * @param listEntitiesDetectionJobsRequest
     * @return A Java Future containing the result of the ListEntitiesDetectionJobs operation returned by the service.
     * @sample AmazonComprehendAsync.ListEntitiesDetectionJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/ListEntitiesDetectionJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEntitiesDetectionJobsResult> listEntitiesDetectionJobsAsync(
            ListEntitiesDetectionJobsRequest listEntitiesDetectionJobsRequest);

    /**
     * <p>
     * Gets a list of the entity detection jobs that you have submitted.
     * </p>
     * 
     * @param listEntitiesDetectionJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEntitiesDetectionJobs operation returned by the service.
     * @sample AmazonComprehendAsyncHandler.ListEntitiesDetectionJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/ListEntitiesDetectionJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEntitiesDetectionJobsResult> listEntitiesDetectionJobsAsync(
            ListEntitiesDetectionJobsRequest listEntitiesDetectionJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListEntitiesDetectionJobsRequest, ListEntitiesDetectionJobsResult> asyncHandler);

    /**
     * <p>
     * Get a list of key phrase detection jobs that you have submitted.
     * </p>
     * 
     * @param listKeyPhrasesDetectionJobsRequest
     * @return A Java Future containing the result of the ListKeyPhrasesDetectionJobs operation returned by the service.
     * @sample AmazonComprehendAsync.ListKeyPhrasesDetectionJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/ListKeyPhrasesDetectionJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListKeyPhrasesDetectionJobsResult> listKeyPhrasesDetectionJobsAsync(
            ListKeyPhrasesDetectionJobsRequest listKeyPhrasesDetectionJobsRequest);

    /**
     * <p>
     * Get a list of key phrase detection jobs that you have submitted.
     * </p>
     * 
     * @param listKeyPhrasesDetectionJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListKeyPhrasesDetectionJobs operation returned by the service.
     * @sample AmazonComprehendAsyncHandler.ListKeyPhrasesDetectionJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/ListKeyPhrasesDetectionJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListKeyPhrasesDetectionJobsResult> listKeyPhrasesDetectionJobsAsync(
            ListKeyPhrasesDetectionJobsRequest listKeyPhrasesDetectionJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListKeyPhrasesDetectionJobsRequest, ListKeyPhrasesDetectionJobsResult> asyncHandler);

    /**
     * <p>
     * Gets a list of sentiment detection jobs that you have submitted.
     * </p>
     * 
     * @param listSentimentDetectionJobsRequest
     * @return A Java Future containing the result of the ListSentimentDetectionJobs operation returned by the service.
     * @sample AmazonComprehendAsync.ListSentimentDetectionJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/ListSentimentDetectionJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSentimentDetectionJobsResult> listSentimentDetectionJobsAsync(
            ListSentimentDetectionJobsRequest listSentimentDetectionJobsRequest);

    /**
     * <p>
     * Gets a list of sentiment detection jobs that you have submitted.
     * </p>
     * 
     * @param listSentimentDetectionJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSentimentDetectionJobs operation returned by the service.
     * @sample AmazonComprehendAsyncHandler.ListSentimentDetectionJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/ListSentimentDetectionJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSentimentDetectionJobsResult> listSentimentDetectionJobsAsync(
            ListSentimentDetectionJobsRequest listSentimentDetectionJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSentimentDetectionJobsRequest, ListSentimentDetectionJobsResult> asyncHandler);

    /**
     * <p>
     * Gets a list of the topic detection jobs that you have submitted.
     * </p>
     * 
     * @param listTopicsDetectionJobsRequest
     * @return A Java Future containing the result of the ListTopicsDetectionJobs operation returned by the service.
     * @sample AmazonComprehendAsync.ListTopicsDetectionJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/ListTopicsDetectionJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTopicsDetectionJobsResult> listTopicsDetectionJobsAsync(ListTopicsDetectionJobsRequest listTopicsDetectionJobsRequest);

    /**
     * <p>
     * Gets a list of the topic detection jobs that you have submitted.
     * </p>
     * 
     * @param listTopicsDetectionJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTopicsDetectionJobs operation returned by the service.
     * @sample AmazonComprehendAsyncHandler.ListTopicsDetectionJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/ListTopicsDetectionJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTopicsDetectionJobsResult> listTopicsDetectionJobsAsync(ListTopicsDetectionJobsRequest listTopicsDetectionJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTopicsDetectionJobsRequest, ListTopicsDetectionJobsResult> asyncHandler);

    /**
     * <p>
     * Starts an asynchronous dominant language detection job for a collection of documents. Use the operation to track
     * the status of a job.
     * </p>
     * 
     * @param startDominantLanguageDetectionJobRequest
     * @return A Java Future containing the result of the StartDominantLanguageDetectionJob operation returned by the
     *         service.
     * @sample AmazonComprehendAsync.StartDominantLanguageDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/StartDominantLanguageDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartDominantLanguageDetectionJobResult> startDominantLanguageDetectionJobAsync(
            StartDominantLanguageDetectionJobRequest startDominantLanguageDetectionJobRequest);

    /**
     * <p>
     * Starts an asynchronous dominant language detection job for a collection of documents. Use the operation to track
     * the status of a job.
     * </p>
     * 
     * @param startDominantLanguageDetectionJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartDominantLanguageDetectionJob operation returned by the
     *         service.
     * @sample AmazonComprehendAsyncHandler.StartDominantLanguageDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/StartDominantLanguageDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartDominantLanguageDetectionJobResult> startDominantLanguageDetectionJobAsync(
            StartDominantLanguageDetectionJobRequest startDominantLanguageDetectionJobRequest,
            com.amazonaws.handlers.AsyncHandler<StartDominantLanguageDetectionJobRequest, StartDominantLanguageDetectionJobResult> asyncHandler);

    /**
     * <p>
     * Starts an asynchronous entity detection job for a collection of documents. Use the operation to track the status
     * of a job.
     * </p>
     * 
     * @param startEntitiesDetectionJobRequest
     * @return A Java Future containing the result of the StartEntitiesDetectionJob operation returned by the service.
     * @sample AmazonComprehendAsync.StartEntitiesDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/StartEntitiesDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartEntitiesDetectionJobResult> startEntitiesDetectionJobAsync(
            StartEntitiesDetectionJobRequest startEntitiesDetectionJobRequest);

    /**
     * <p>
     * Starts an asynchronous entity detection job for a collection of documents. Use the operation to track the status
     * of a job.
     * </p>
     * 
     * @param startEntitiesDetectionJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartEntitiesDetectionJob operation returned by the service.
     * @sample AmazonComprehendAsyncHandler.StartEntitiesDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/StartEntitiesDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartEntitiesDetectionJobResult> startEntitiesDetectionJobAsync(
            StartEntitiesDetectionJobRequest startEntitiesDetectionJobRequest,
            com.amazonaws.handlers.AsyncHandler<StartEntitiesDetectionJobRequest, StartEntitiesDetectionJobResult> asyncHandler);

    /**
     * <p>
     * Starts an asynchronous key phrase detection job for a collection of documents. Use the operation to track the
     * status of a job.
     * </p>
     * 
     * @param startKeyPhrasesDetectionJobRequest
     * @return A Java Future containing the result of the StartKeyPhrasesDetectionJob operation returned by the service.
     * @sample AmazonComprehendAsync.StartKeyPhrasesDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/StartKeyPhrasesDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartKeyPhrasesDetectionJobResult> startKeyPhrasesDetectionJobAsync(
            StartKeyPhrasesDetectionJobRequest startKeyPhrasesDetectionJobRequest);

    /**
     * <p>
     * Starts an asynchronous key phrase detection job for a collection of documents. Use the operation to track the
     * status of a job.
     * </p>
     * 
     * @param startKeyPhrasesDetectionJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartKeyPhrasesDetectionJob operation returned by the service.
     * @sample AmazonComprehendAsyncHandler.StartKeyPhrasesDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/StartKeyPhrasesDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartKeyPhrasesDetectionJobResult> startKeyPhrasesDetectionJobAsync(
            StartKeyPhrasesDetectionJobRequest startKeyPhrasesDetectionJobRequest,
            com.amazonaws.handlers.AsyncHandler<StartKeyPhrasesDetectionJobRequest, StartKeyPhrasesDetectionJobResult> asyncHandler);

    /**
     * <p>
     * Starts an asynchronous sentiment detection job for a collection of documents. use the operation to track the
     * status of a job.
     * </p>
     * 
     * @param startSentimentDetectionJobRequest
     * @return A Java Future containing the result of the StartSentimentDetectionJob operation returned by the service.
     * @sample AmazonComprehendAsync.StartSentimentDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/StartSentimentDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartSentimentDetectionJobResult> startSentimentDetectionJobAsync(
            StartSentimentDetectionJobRequest startSentimentDetectionJobRequest);

    /**
     * <p>
     * Starts an asynchronous sentiment detection job for a collection of documents. use the operation to track the
     * status of a job.
     * </p>
     * 
     * @param startSentimentDetectionJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartSentimentDetectionJob operation returned by the service.
     * @sample AmazonComprehendAsyncHandler.StartSentimentDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/StartSentimentDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartSentimentDetectionJobResult> startSentimentDetectionJobAsync(
            StartSentimentDetectionJobRequest startSentimentDetectionJobRequest,
            com.amazonaws.handlers.AsyncHandler<StartSentimentDetectionJobRequest, StartSentimentDetectionJobResult> asyncHandler);

    /**
     * <p>
     * Starts an asynchronous topic detection job. Use the <code>DescribeTopicDetectionJob</code> operation to track the
     * status of a job.
     * </p>
     * 
     * @param startTopicsDetectionJobRequest
     * @return A Java Future containing the result of the StartTopicsDetectionJob operation returned by the service.
     * @sample AmazonComprehendAsync.StartTopicsDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/StartTopicsDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartTopicsDetectionJobResult> startTopicsDetectionJobAsync(StartTopicsDetectionJobRequest startTopicsDetectionJobRequest);

    /**
     * <p>
     * Starts an asynchronous topic detection job. Use the <code>DescribeTopicDetectionJob</code> operation to track the
     * status of a job.
     * </p>
     * 
     * @param startTopicsDetectionJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartTopicsDetectionJob operation returned by the service.
     * @sample AmazonComprehendAsyncHandler.StartTopicsDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/StartTopicsDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartTopicsDetectionJobResult> startTopicsDetectionJobAsync(StartTopicsDetectionJobRequest startTopicsDetectionJobRequest,
            com.amazonaws.handlers.AsyncHandler<StartTopicsDetectionJobRequest, StartTopicsDetectionJobResult> asyncHandler);

    /**
     * <p>
     * Stops a dominant language detection job in progress.
     * </p>
     * <p>
     * If the job state is <code>IN_PROGRESS</code> the job is marked for termination and put into the
     * <code>STOP_REQUESTED</code> state. If the job completes before it can be stopped, it is put into the
     * <code>COMPLETED</code> state; otherwise the job is stopped and put into the <code>STOPPED</code> state.
     * </p>
     * <p>
     * If the job is in the <code>COMPLETED</code> or <code>FAILED</code> state when you call the
     * <code>StopDominantLanguageDetectionJob</code> operation, the operation returns a 400 Internal Request Exception.
     * </p>
     * <p>
     * When a job is stopped, any documents already processed are written to the output location.
     * </p>
     * 
     * @param stopDominantLanguageDetectionJobRequest
     * @return A Java Future containing the result of the StopDominantLanguageDetectionJob operation returned by the
     *         service.
     * @sample AmazonComprehendAsync.StopDominantLanguageDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/StopDominantLanguageDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopDominantLanguageDetectionJobResult> stopDominantLanguageDetectionJobAsync(
            StopDominantLanguageDetectionJobRequest stopDominantLanguageDetectionJobRequest);

    /**
     * <p>
     * Stops a dominant language detection job in progress.
     * </p>
     * <p>
     * If the job state is <code>IN_PROGRESS</code> the job is marked for termination and put into the
     * <code>STOP_REQUESTED</code> state. If the job completes before it can be stopped, it is put into the
     * <code>COMPLETED</code> state; otherwise the job is stopped and put into the <code>STOPPED</code> state.
     * </p>
     * <p>
     * If the job is in the <code>COMPLETED</code> or <code>FAILED</code> state when you call the
     * <code>StopDominantLanguageDetectionJob</code> operation, the operation returns a 400 Internal Request Exception.
     * </p>
     * <p>
     * When a job is stopped, any documents already processed are written to the output location.
     * </p>
     * 
     * @param stopDominantLanguageDetectionJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopDominantLanguageDetectionJob operation returned by the
     *         service.
     * @sample AmazonComprehendAsyncHandler.StopDominantLanguageDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/StopDominantLanguageDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopDominantLanguageDetectionJobResult> stopDominantLanguageDetectionJobAsync(
            StopDominantLanguageDetectionJobRequest stopDominantLanguageDetectionJobRequest,
            com.amazonaws.handlers.AsyncHandler<StopDominantLanguageDetectionJobRequest, StopDominantLanguageDetectionJobResult> asyncHandler);

    /**
     * <p>
     * Stops an entities detection job in progress.
     * </p>
     * <p>
     * If the job state is <code>IN_PROGRESS</code> the job is marked for termination and put into the
     * <code>STOP_REQUESTED</code> state. If the job completes before it can be stopped, it is put into the
     * <code>COMPLETED</code> state; otherwise the job is stopped and put into the <code>STOPPED</code> state.
     * </p>
     * <p>
     * If the job is in the <code>COMPLETED</code> or <code>FAILED</code> state when you call the
     * <code>StopDominantLanguageDetectionJob</code> operation, the operation returns a 400 Internal Request Exception.
     * </p>
     * <p>
     * When a job is stopped, any documents already processed are written to the output location.
     * </p>
     * 
     * @param stopEntitiesDetectionJobRequest
     * @return A Java Future containing the result of the StopEntitiesDetectionJob operation returned by the service.
     * @sample AmazonComprehendAsync.StopEntitiesDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/StopEntitiesDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopEntitiesDetectionJobResult> stopEntitiesDetectionJobAsync(StopEntitiesDetectionJobRequest stopEntitiesDetectionJobRequest);

    /**
     * <p>
     * Stops an entities detection job in progress.
     * </p>
     * <p>
     * If the job state is <code>IN_PROGRESS</code> the job is marked for termination and put into the
     * <code>STOP_REQUESTED</code> state. If the job completes before it can be stopped, it is put into the
     * <code>COMPLETED</code> state; otherwise the job is stopped and put into the <code>STOPPED</code> state.
     * </p>
     * <p>
     * If the job is in the <code>COMPLETED</code> or <code>FAILED</code> state when you call the
     * <code>StopDominantLanguageDetectionJob</code> operation, the operation returns a 400 Internal Request Exception.
     * </p>
     * <p>
     * When a job is stopped, any documents already processed are written to the output location.
     * </p>
     * 
     * @param stopEntitiesDetectionJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopEntitiesDetectionJob operation returned by the service.
     * @sample AmazonComprehendAsyncHandler.StopEntitiesDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/StopEntitiesDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopEntitiesDetectionJobResult> stopEntitiesDetectionJobAsync(StopEntitiesDetectionJobRequest stopEntitiesDetectionJobRequest,
            com.amazonaws.handlers.AsyncHandler<StopEntitiesDetectionJobRequest, StopEntitiesDetectionJobResult> asyncHandler);

    /**
     * <p>
     * Stops a key phrases detection job in progress.
     * </p>
     * <p>
     * If the job state is <code>IN_PROGRESS</code> the job is marked for termination and put into the
     * <code>STOP_REQUESTED</code> state. If the job completes before it can be stopped, it is put into the
     * <code>COMPLETED</code> state; otherwise the job is stopped and put into the <code>STOPPED</code> state.
     * </p>
     * <p>
     * If the job is in the <code>COMPLETED</code> or <code>FAILED</code> state when you call the
     * <code>StopDominantLanguageDetectionJob</code> operation, the operation returns a 400 Internal Request Exception.
     * </p>
     * <p>
     * When a job is stopped, any documents already processed are written to the output location.
     * </p>
     * 
     * @param stopKeyPhrasesDetectionJobRequest
     * @return A Java Future containing the result of the StopKeyPhrasesDetectionJob operation returned by the service.
     * @sample AmazonComprehendAsync.StopKeyPhrasesDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/StopKeyPhrasesDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopKeyPhrasesDetectionJobResult> stopKeyPhrasesDetectionJobAsync(
            StopKeyPhrasesDetectionJobRequest stopKeyPhrasesDetectionJobRequest);

    /**
     * <p>
     * Stops a key phrases detection job in progress.
     * </p>
     * <p>
     * If the job state is <code>IN_PROGRESS</code> the job is marked for termination and put into the
     * <code>STOP_REQUESTED</code> state. If the job completes before it can be stopped, it is put into the
     * <code>COMPLETED</code> state; otherwise the job is stopped and put into the <code>STOPPED</code> state.
     * </p>
     * <p>
     * If the job is in the <code>COMPLETED</code> or <code>FAILED</code> state when you call the
     * <code>StopDominantLanguageDetectionJob</code> operation, the operation returns a 400 Internal Request Exception.
     * </p>
     * <p>
     * When a job is stopped, any documents already processed are written to the output location.
     * </p>
     * 
     * @param stopKeyPhrasesDetectionJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopKeyPhrasesDetectionJob operation returned by the service.
     * @sample AmazonComprehendAsyncHandler.StopKeyPhrasesDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/StopKeyPhrasesDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopKeyPhrasesDetectionJobResult> stopKeyPhrasesDetectionJobAsync(
            StopKeyPhrasesDetectionJobRequest stopKeyPhrasesDetectionJobRequest,
            com.amazonaws.handlers.AsyncHandler<StopKeyPhrasesDetectionJobRequest, StopKeyPhrasesDetectionJobResult> asyncHandler);

    /**
     * <p>
     * Stops a sentiment detection job in progress.
     * </p>
     * <p>
     * If the job state is <code>IN_PROGRESS</code> the job is marked for termination and put into the
     * <code>STOP_REQUESTED</code> state. If the job completes before it can be stopped, it is put into the
     * <code>COMPLETED</code> state; otherwise the job is be stopped and put into the <code>STOPPED</code> state.
     * </p>
     * <p>
     * If the job is in the <code>COMPLETED</code> or <code>FAILED</code> state when you call the
     * <code>StopDominantLanguageDetectionJob</code> operation, the operation returns a 400 Internal Request Exception.
     * </p>
     * <p>
     * When a job is stopped, any documents already processed are written to the output location.
     * </p>
     * 
     * @param stopSentimentDetectionJobRequest
     * @return A Java Future containing the result of the StopSentimentDetectionJob operation returned by the service.
     * @sample AmazonComprehendAsync.StopSentimentDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/StopSentimentDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopSentimentDetectionJobResult> stopSentimentDetectionJobAsync(
            StopSentimentDetectionJobRequest stopSentimentDetectionJobRequest);

    /**
     * <p>
     * Stops a sentiment detection job in progress.
     * </p>
     * <p>
     * If the job state is <code>IN_PROGRESS</code> the job is marked for termination and put into the
     * <code>STOP_REQUESTED</code> state. If the job completes before it can be stopped, it is put into the
     * <code>COMPLETED</code> state; otherwise the job is be stopped and put into the <code>STOPPED</code> state.
     * </p>
     * <p>
     * If the job is in the <code>COMPLETED</code> or <code>FAILED</code> state when you call the
     * <code>StopDominantLanguageDetectionJob</code> operation, the operation returns a 400 Internal Request Exception.
     * </p>
     * <p>
     * When a job is stopped, any documents already processed are written to the output location.
     * </p>
     * 
     * @param stopSentimentDetectionJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopSentimentDetectionJob operation returned by the service.
     * @sample AmazonComprehendAsyncHandler.StopSentimentDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/StopSentimentDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopSentimentDetectionJobResult> stopSentimentDetectionJobAsync(
            StopSentimentDetectionJobRequest stopSentimentDetectionJobRequest,
            com.amazonaws.handlers.AsyncHandler<StopSentimentDetectionJobRequest, StopSentimentDetectionJobResult> asyncHandler);

}
