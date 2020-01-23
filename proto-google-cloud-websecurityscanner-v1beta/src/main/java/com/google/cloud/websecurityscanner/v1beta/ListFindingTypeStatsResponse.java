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
// source: google/cloud/websecurityscanner/v1beta/web_security_scanner.proto

package com.google.cloud.websecurityscanner.v1beta;

/**
 *
 *
 * <pre>
 * Response for the `ListFindingTypeStats` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse}
 */
public final class ListFindingTypeStatsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse)
    ListFindingTypeStatsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListFindingTypeStatsResponse.newBuilder() to construct.
  private ListFindingTypeStatsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListFindingTypeStatsResponse() {
    findingTypeStats_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListFindingTypeStatsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ListFindingTypeStatsResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                findingTypeStats_ =
                    new java.util.ArrayList<
                        com.google.cloud.websecurityscanner.v1beta.FindingTypeStats>();
                mutable_bitField0_ |= 0x00000001;
              }
              findingTypeStats_.add(
                  input.readMessage(
                      com.google.cloud.websecurityscanner.v1beta.FindingTypeStats.parser(),
                      extensionRegistry));
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        findingTypeStats_ = java.util.Collections.unmodifiableList(findingTypeStats_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerProto
        .internal_static_google_cloud_websecurityscanner_v1beta_ListFindingTypeStatsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerProto
        .internal_static_google_cloud_websecurityscanner_v1beta_ListFindingTypeStatsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse.class,
            com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse.Builder.class);
  }

  public static final int FINDING_TYPE_STATS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.websecurityscanner.v1beta.FindingTypeStats>
      findingTypeStats_;
  /**
   *
   *
   * <pre>
   * The list of FindingTypeStats returned.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1beta.FindingTypeStats finding_type_stats = 1;
   * </code>
   */
  public java.util.List<com.google.cloud.websecurityscanner.v1beta.FindingTypeStats>
      getFindingTypeStatsList() {
    return findingTypeStats_;
  }
  /**
   *
   *
   * <pre>
   * The list of FindingTypeStats returned.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1beta.FindingTypeStats finding_type_stats = 1;
   * </code>
   */
  public java.util.List<
          ? extends com.google.cloud.websecurityscanner.v1beta.FindingTypeStatsOrBuilder>
      getFindingTypeStatsOrBuilderList() {
    return findingTypeStats_;
  }
  /**
   *
   *
   * <pre>
   * The list of FindingTypeStats returned.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1beta.FindingTypeStats finding_type_stats = 1;
   * </code>
   */
  public int getFindingTypeStatsCount() {
    return findingTypeStats_.size();
  }
  /**
   *
   *
   * <pre>
   * The list of FindingTypeStats returned.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1beta.FindingTypeStats finding_type_stats = 1;
   * </code>
   */
  public com.google.cloud.websecurityscanner.v1beta.FindingTypeStats getFindingTypeStats(
      int index) {
    return findingTypeStats_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The list of FindingTypeStats returned.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1beta.FindingTypeStats finding_type_stats = 1;
   * </code>
   */
  public com.google.cloud.websecurityscanner.v1beta.FindingTypeStatsOrBuilder
      getFindingTypeStatsOrBuilder(int index) {
    return findingTypeStats_.get(index);
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < findingTypeStats_.size(); i++) {
      output.writeMessage(1, findingTypeStats_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < findingTypeStats_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, findingTypeStats_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse other =
        (com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse) obj;

    if (!getFindingTypeStatsList().equals(other.getFindingTypeStatsList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getFindingTypeStatsCount() > 0) {
      hash = (37 * hash) + FINDING_TYPE_STATS_FIELD_NUMBER;
      hash = (53 * hash) + getFindingTypeStatsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Response for the `ListFindingTypeStats` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse)
      com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerProto
          .internal_static_google_cloud_websecurityscanner_v1beta_ListFindingTypeStatsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerProto
          .internal_static_google_cloud_websecurityscanner_v1beta_ListFindingTypeStatsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse.class,
              com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse.Builder
                  .class);
    }

    // Construct using
    // com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getFindingTypeStatsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (findingTypeStatsBuilder_ == null) {
        findingTypeStats_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        findingTypeStatsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerProto
          .internal_static_google_cloud_websecurityscanner_v1beta_ListFindingTypeStatsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse
        getDefaultInstanceForType() {
      return com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse build() {
      com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse buildPartial() {
      com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse result =
          new com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse(this);
      int from_bitField0_ = bitField0_;
      if (findingTypeStatsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          findingTypeStats_ = java.util.Collections.unmodifiableList(findingTypeStats_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.findingTypeStats_ = findingTypeStats_;
      } else {
        result.findingTypeStats_ = findingTypeStatsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other
          instanceof com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse) {
        return mergeFrom(
            (com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse other) {
      if (other
          == com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse
              .getDefaultInstance()) return this;
      if (findingTypeStatsBuilder_ == null) {
        if (!other.findingTypeStats_.isEmpty()) {
          if (findingTypeStats_.isEmpty()) {
            findingTypeStats_ = other.findingTypeStats_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFindingTypeStatsIsMutable();
            findingTypeStats_.addAll(other.findingTypeStats_);
          }
          onChanged();
        }
      } else {
        if (!other.findingTypeStats_.isEmpty()) {
          if (findingTypeStatsBuilder_.isEmpty()) {
            findingTypeStatsBuilder_.dispose();
            findingTypeStatsBuilder_ = null;
            findingTypeStats_ = other.findingTypeStats_;
            bitField0_ = (bitField0_ & ~0x00000001);
            findingTypeStatsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getFindingTypeStatsFieldBuilder()
                    : null;
          } else {
            findingTypeStatsBuilder_.addAllMessages(other.findingTypeStats_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.cloud.websecurityscanner.v1beta.FindingTypeStats>
        findingTypeStats_ = java.util.Collections.emptyList();

    private void ensureFindingTypeStatsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        findingTypeStats_ =
            new java.util.ArrayList<com.google.cloud.websecurityscanner.v1beta.FindingTypeStats>(
                findingTypeStats_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.websecurityscanner.v1beta.FindingTypeStats,
            com.google.cloud.websecurityscanner.v1beta.FindingTypeStats.Builder,
            com.google.cloud.websecurityscanner.v1beta.FindingTypeStatsOrBuilder>
        findingTypeStatsBuilder_;

    /**
     *
     *
     * <pre>
     * The list of FindingTypeStats returned.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.websecurityscanner.v1beta.FindingTypeStats finding_type_stats = 1;
     * </code>
     */
    public java.util.List<com.google.cloud.websecurityscanner.v1beta.FindingTypeStats>
        getFindingTypeStatsList() {
      if (findingTypeStatsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(findingTypeStats_);
      } else {
        return findingTypeStatsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of FindingTypeStats returned.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.websecurityscanner.v1beta.FindingTypeStats finding_type_stats = 1;
     * </code>
     */
    public int getFindingTypeStatsCount() {
      if (findingTypeStatsBuilder_ == null) {
        return findingTypeStats_.size();
      } else {
        return findingTypeStatsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of FindingTypeStats returned.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.websecurityscanner.v1beta.FindingTypeStats finding_type_stats = 1;
     * </code>
     */
    public com.google.cloud.websecurityscanner.v1beta.FindingTypeStats getFindingTypeStats(
        int index) {
      if (findingTypeStatsBuilder_ == null) {
        return findingTypeStats_.get(index);
      } else {
        return findingTypeStatsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of FindingTypeStats returned.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.websecurityscanner.v1beta.FindingTypeStats finding_type_stats = 1;
     * </code>
     */
    public Builder setFindingTypeStats(
        int index, com.google.cloud.websecurityscanner.v1beta.FindingTypeStats value) {
      if (findingTypeStatsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFindingTypeStatsIsMutable();
        findingTypeStats_.set(index, value);
        onChanged();
      } else {
        findingTypeStatsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of FindingTypeStats returned.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.websecurityscanner.v1beta.FindingTypeStats finding_type_stats = 1;
     * </code>
     */
    public Builder setFindingTypeStats(
        int index,
        com.google.cloud.websecurityscanner.v1beta.FindingTypeStats.Builder builderForValue) {
      if (findingTypeStatsBuilder_ == null) {
        ensureFindingTypeStatsIsMutable();
        findingTypeStats_.set(index, builderForValue.build());
        onChanged();
      } else {
        findingTypeStatsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of FindingTypeStats returned.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.websecurityscanner.v1beta.FindingTypeStats finding_type_stats = 1;
     * </code>
     */
    public Builder addFindingTypeStats(
        com.google.cloud.websecurityscanner.v1beta.FindingTypeStats value) {
      if (findingTypeStatsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFindingTypeStatsIsMutable();
        findingTypeStats_.add(value);
        onChanged();
      } else {
        findingTypeStatsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of FindingTypeStats returned.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.websecurityscanner.v1beta.FindingTypeStats finding_type_stats = 1;
     * </code>
     */
    public Builder addFindingTypeStats(
        int index, com.google.cloud.websecurityscanner.v1beta.FindingTypeStats value) {
      if (findingTypeStatsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFindingTypeStatsIsMutable();
        findingTypeStats_.add(index, value);
        onChanged();
      } else {
        findingTypeStatsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of FindingTypeStats returned.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.websecurityscanner.v1beta.FindingTypeStats finding_type_stats = 1;
     * </code>
     */
    public Builder addFindingTypeStats(
        com.google.cloud.websecurityscanner.v1beta.FindingTypeStats.Builder builderForValue) {
      if (findingTypeStatsBuilder_ == null) {
        ensureFindingTypeStatsIsMutable();
        findingTypeStats_.add(builderForValue.build());
        onChanged();
      } else {
        findingTypeStatsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of FindingTypeStats returned.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.websecurityscanner.v1beta.FindingTypeStats finding_type_stats = 1;
     * </code>
     */
    public Builder addFindingTypeStats(
        int index,
        com.google.cloud.websecurityscanner.v1beta.FindingTypeStats.Builder builderForValue) {
      if (findingTypeStatsBuilder_ == null) {
        ensureFindingTypeStatsIsMutable();
        findingTypeStats_.add(index, builderForValue.build());
        onChanged();
      } else {
        findingTypeStatsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of FindingTypeStats returned.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.websecurityscanner.v1beta.FindingTypeStats finding_type_stats = 1;
     * </code>
     */
    public Builder addAllFindingTypeStats(
        java.lang.Iterable<? extends com.google.cloud.websecurityscanner.v1beta.FindingTypeStats>
            values) {
      if (findingTypeStatsBuilder_ == null) {
        ensureFindingTypeStatsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, findingTypeStats_);
        onChanged();
      } else {
        findingTypeStatsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of FindingTypeStats returned.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.websecurityscanner.v1beta.FindingTypeStats finding_type_stats = 1;
     * </code>
     */
    public Builder clearFindingTypeStats() {
      if (findingTypeStatsBuilder_ == null) {
        findingTypeStats_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        findingTypeStatsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of FindingTypeStats returned.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.websecurityscanner.v1beta.FindingTypeStats finding_type_stats = 1;
     * </code>
     */
    public Builder removeFindingTypeStats(int index) {
      if (findingTypeStatsBuilder_ == null) {
        ensureFindingTypeStatsIsMutable();
        findingTypeStats_.remove(index);
        onChanged();
      } else {
        findingTypeStatsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of FindingTypeStats returned.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.websecurityscanner.v1beta.FindingTypeStats finding_type_stats = 1;
     * </code>
     */
    public com.google.cloud.websecurityscanner.v1beta.FindingTypeStats.Builder
        getFindingTypeStatsBuilder(int index) {
      return getFindingTypeStatsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The list of FindingTypeStats returned.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.websecurityscanner.v1beta.FindingTypeStats finding_type_stats = 1;
     * </code>
     */
    public com.google.cloud.websecurityscanner.v1beta.FindingTypeStatsOrBuilder
        getFindingTypeStatsOrBuilder(int index) {
      if (findingTypeStatsBuilder_ == null) {
        return findingTypeStats_.get(index);
      } else {
        return findingTypeStatsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of FindingTypeStats returned.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.websecurityscanner.v1beta.FindingTypeStats finding_type_stats = 1;
     * </code>
     */
    public java.util.List<
            ? extends com.google.cloud.websecurityscanner.v1beta.FindingTypeStatsOrBuilder>
        getFindingTypeStatsOrBuilderList() {
      if (findingTypeStatsBuilder_ != null) {
        return findingTypeStatsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(findingTypeStats_);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of FindingTypeStats returned.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.websecurityscanner.v1beta.FindingTypeStats finding_type_stats = 1;
     * </code>
     */
    public com.google.cloud.websecurityscanner.v1beta.FindingTypeStats.Builder
        addFindingTypeStatsBuilder() {
      return getFindingTypeStatsFieldBuilder()
          .addBuilder(
              com.google.cloud.websecurityscanner.v1beta.FindingTypeStats.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of FindingTypeStats returned.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.websecurityscanner.v1beta.FindingTypeStats finding_type_stats = 1;
     * </code>
     */
    public com.google.cloud.websecurityscanner.v1beta.FindingTypeStats.Builder
        addFindingTypeStatsBuilder(int index) {
      return getFindingTypeStatsFieldBuilder()
          .addBuilder(
              index,
              com.google.cloud.websecurityscanner.v1beta.FindingTypeStats.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of FindingTypeStats returned.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.websecurityscanner.v1beta.FindingTypeStats finding_type_stats = 1;
     * </code>
     */
    public java.util.List<com.google.cloud.websecurityscanner.v1beta.FindingTypeStats.Builder>
        getFindingTypeStatsBuilderList() {
      return getFindingTypeStatsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.websecurityscanner.v1beta.FindingTypeStats,
            com.google.cloud.websecurityscanner.v1beta.FindingTypeStats.Builder,
            com.google.cloud.websecurityscanner.v1beta.FindingTypeStatsOrBuilder>
        getFindingTypeStatsFieldBuilder() {
      if (findingTypeStatsBuilder_ == null) {
        findingTypeStatsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.websecurityscanner.v1beta.FindingTypeStats,
                com.google.cloud.websecurityscanner.v1beta.FindingTypeStats.Builder,
                com.google.cloud.websecurityscanner.v1beta.FindingTypeStatsOrBuilder>(
                findingTypeStats_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        findingTypeStats_ = null;
      }
      return findingTypeStatsBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse)
  private static final com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse();
  }

  public static com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListFindingTypeStatsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListFindingTypeStatsResponse>() {
        @java.lang.Override
        public ListFindingTypeStatsResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ListFindingTypeStatsResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ListFindingTypeStatsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListFindingTypeStatsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
