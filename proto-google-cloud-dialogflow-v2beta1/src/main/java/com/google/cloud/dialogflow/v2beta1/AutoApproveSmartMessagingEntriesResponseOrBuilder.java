/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/document.proto

package com.google.cloud.dialogflow.v2beta1;

public interface AutoApproveSmartMessagingEntriesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.AutoApproveSmartMessagingEntriesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Number of smart messaging entries enabled.
   * </pre>
   *
   * <code>int32 enabled_count = 1;</code>
   *
   * @return The enabledCount.
   */
  int getEnabledCount();

  /**
   *
   *
   * <pre>
   * Number of smart messaging entries disabled.
   * </pre>
   *
   * <code>int32 disabled_count = 2;</code>
   *
   * @return The disabledCount.
   */
  int getDisabledCount();

  /**
   *
   *
   * <pre>
   * Number of smart messaging entries unreviewed.
   * </pre>
   *
   * <code>int32 unreviewed_count = 3;</code>
   *
   * @return The unreviewedCount.
   */
  int getUnreviewedCount();
}
