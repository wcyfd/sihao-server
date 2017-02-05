// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ServerMessage.proto

package com.randioo.sihao_server.protocol;

public final class ServerMessage {
  private ServerMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class SCMessage extends
      com.google.protobuf.GeneratedMessage {
    // Use SCMessage.newBuilder() to construct.
    private SCMessage() {
      initFields();
    }
    private SCMessage(boolean noInit) {}
    
    private static final SCMessage defaultInstance;
    public static SCMessage getDefaultInstance() {
      return defaultInstance;
    }
    
    public SCMessage getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.randioo.sihao_server.protocol.ServerMessage.internal_static_com_randioo_sihao_server_protocol_SCMessage_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.randioo.sihao_server.protocol.ServerMessage.internal_static_com_randioo_sihao_server_protocol_SCMessage_fieldAccessorTable;
    }
    
    // optional .com.randioo.sihao_server.protocol.LoginCheckAccountResponse loginCheckAccountResponse = 1;
    public static final int LOGINCHECKACCOUNTRESPONSE_FIELD_NUMBER = 1;
    private boolean hasLoginCheckAccountResponse;
    private com.randioo.sihao_server.protocol.Login.LoginCheckAccountResponse loginCheckAccountResponse_;
    public boolean hasLoginCheckAccountResponse() { return hasLoginCheckAccountResponse; }
    public com.randioo.sihao_server.protocol.Login.LoginCheckAccountResponse getLoginCheckAccountResponse() { return loginCheckAccountResponse_; }
    
    // optional .com.randioo.sihao_server.protocol.LoginCreateRoleResponse loginCreateRoleResponse = 2;
    public static final int LOGINCREATEROLERESPONSE_FIELD_NUMBER = 2;
    private boolean hasLoginCreateRoleResponse;
    private com.randioo.sihao_server.protocol.Login.LoginCreateRoleResponse loginCreateRoleResponse_;
    public boolean hasLoginCreateRoleResponse() { return hasLoginCreateRoleResponse; }
    public com.randioo.sihao_server.protocol.Login.LoginCreateRoleResponse getLoginCreateRoleResponse() { return loginCreateRoleResponse_; }
    
    // optional .com.randioo.sihao_server.protocol.LoginGetRoleDataResponse loginGetRoleDataResponse = 3;
    public static final int LOGINGETROLEDATARESPONSE_FIELD_NUMBER = 3;
    private boolean hasLoginGetRoleDataResponse;
    private com.randioo.sihao_server.protocol.Login.LoginGetRoleDataResponse loginGetRoleDataResponse_;
    public boolean hasLoginGetRoleDataResponse() { return hasLoginGetRoleDataResponse; }
    public com.randioo.sihao_server.protocol.Login.LoginGetRoleDataResponse getLoginGetRoleDataResponse() { return loginGetRoleDataResponse_; }
    
    // optional .com.randioo.sihao_server.protocol.PingResponse pingResponse = 4;
    public static final int PINGRESPONSE_FIELD_NUMBER = 4;
    private boolean hasPingResponse;
    private com.randioo.sihao_server.protocol.Ping.PingResponse pingResponse_;
    public boolean hasPingResponse() { return hasPingResponse; }
    public com.randioo.sihao_server.protocol.Ping.PingResponse getPingResponse() { return pingResponse_; }
    
    private void initFields() {
      loginCheckAccountResponse_ = com.randioo.sihao_server.protocol.Login.LoginCheckAccountResponse.getDefaultInstance();
      loginCreateRoleResponse_ = com.randioo.sihao_server.protocol.Login.LoginCreateRoleResponse.getDefaultInstance();
      loginGetRoleDataResponse_ = com.randioo.sihao_server.protocol.Login.LoginGetRoleDataResponse.getDefaultInstance();
      pingResponse_ = com.randioo.sihao_server.protocol.Ping.PingResponse.getDefaultInstance();
    }
    public final boolean isInitialized() {
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasLoginCheckAccountResponse()) {
        output.writeMessage(1, getLoginCheckAccountResponse());
      }
      if (hasLoginCreateRoleResponse()) {
        output.writeMessage(2, getLoginCreateRoleResponse());
      }
      if (hasLoginGetRoleDataResponse()) {
        output.writeMessage(3, getLoginGetRoleDataResponse());
      }
      if (hasPingResponse()) {
        output.writeMessage(4, getPingResponse());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasLoginCheckAccountResponse()) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getLoginCheckAccountResponse());
      }
      if (hasLoginCreateRoleResponse()) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getLoginCreateRoleResponse());
      }
      if (hasLoginGetRoleDataResponse()) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getLoginGetRoleDataResponse());
      }
      if (hasPingResponse()) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, getPingResponse());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.randioo.sihao_server.protocol.ServerMessage.SCMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.randioo.sihao_server.protocol.ServerMessage.SCMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.randioo.sihao_server.protocol.ServerMessage.SCMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.randioo.sihao_server.protocol.ServerMessage.SCMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.randioo.sihao_server.protocol.ServerMessage.SCMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.randioo.sihao_server.protocol.ServerMessage.SCMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.randioo.sihao_server.protocol.ServerMessage.SCMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.randioo.sihao_server.protocol.ServerMessage.SCMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.randioo.sihao_server.protocol.ServerMessage.SCMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.randioo.sihao_server.protocol.ServerMessage.SCMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.randioo.sihao_server.protocol.ServerMessage.SCMessage prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.randioo.sihao_server.protocol.ServerMessage.SCMessage result;
      
      // Construct using com.randioo.sihao_server.protocol.ServerMessage.SCMessage.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.randioo.sihao_server.protocol.ServerMessage.SCMessage();
        return builder;
      }
      
      protected com.randioo.sihao_server.protocol.ServerMessage.SCMessage internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.randioo.sihao_server.protocol.ServerMessage.SCMessage();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.randioo.sihao_server.protocol.ServerMessage.SCMessage.getDescriptor();
      }
      
      public com.randioo.sihao_server.protocol.ServerMessage.SCMessage getDefaultInstanceForType() {
        return com.randioo.sihao_server.protocol.ServerMessage.SCMessage.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.randioo.sihao_server.protocol.ServerMessage.SCMessage build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.randioo.sihao_server.protocol.ServerMessage.SCMessage buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.randioo.sihao_server.protocol.ServerMessage.SCMessage buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.randioo.sihao_server.protocol.ServerMessage.SCMessage returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.randioo.sihao_server.protocol.ServerMessage.SCMessage) {
          return mergeFrom((com.randioo.sihao_server.protocol.ServerMessage.SCMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.randioo.sihao_server.protocol.ServerMessage.SCMessage other) {
        if (other == com.randioo.sihao_server.protocol.ServerMessage.SCMessage.getDefaultInstance()) return this;
        if (other.hasLoginCheckAccountResponse()) {
          mergeLoginCheckAccountResponse(other.getLoginCheckAccountResponse());
        }
        if (other.hasLoginCreateRoleResponse()) {
          mergeLoginCreateRoleResponse(other.getLoginCreateRoleResponse());
        }
        if (other.hasLoginGetRoleDataResponse()) {
          mergeLoginGetRoleDataResponse(other.getLoginGetRoleDataResponse());
        }
        if (other.hasPingResponse()) {
          mergePingResponse(other.getPingResponse());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                return this;
              }
              break;
            }
            case 10: {
              com.randioo.sihao_server.protocol.Login.LoginCheckAccountResponse.Builder subBuilder = com.randioo.sihao_server.protocol.Login.LoginCheckAccountResponse.newBuilder();
              if (hasLoginCheckAccountResponse()) {
                subBuilder.mergeFrom(getLoginCheckAccountResponse());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setLoginCheckAccountResponse(subBuilder.buildPartial());
              break;
            }
            case 18: {
              com.randioo.sihao_server.protocol.Login.LoginCreateRoleResponse.Builder subBuilder = com.randioo.sihao_server.protocol.Login.LoginCreateRoleResponse.newBuilder();
              if (hasLoginCreateRoleResponse()) {
                subBuilder.mergeFrom(getLoginCreateRoleResponse());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setLoginCreateRoleResponse(subBuilder.buildPartial());
              break;
            }
            case 26: {
              com.randioo.sihao_server.protocol.Login.LoginGetRoleDataResponse.Builder subBuilder = com.randioo.sihao_server.protocol.Login.LoginGetRoleDataResponse.newBuilder();
              if (hasLoginGetRoleDataResponse()) {
                subBuilder.mergeFrom(getLoginGetRoleDataResponse());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setLoginGetRoleDataResponse(subBuilder.buildPartial());
              break;
            }
            case 34: {
              com.randioo.sihao_server.protocol.Ping.PingResponse.Builder subBuilder = com.randioo.sihao_server.protocol.Ping.PingResponse.newBuilder();
              if (hasPingResponse()) {
                subBuilder.mergeFrom(getPingResponse());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setPingResponse(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      
      // optional .com.randioo.sihao_server.protocol.LoginCheckAccountResponse loginCheckAccountResponse = 1;
      public boolean hasLoginCheckAccountResponse() {
        return result.hasLoginCheckAccountResponse();
      }
      public com.randioo.sihao_server.protocol.Login.LoginCheckAccountResponse getLoginCheckAccountResponse() {
        return result.getLoginCheckAccountResponse();
      }
      public Builder setLoginCheckAccountResponse(com.randioo.sihao_server.protocol.Login.LoginCheckAccountResponse value) {
        if (value == null) {
          throw new NullPointerException();
        }
        result.hasLoginCheckAccountResponse = true;
        result.loginCheckAccountResponse_ = value;
        return this;
      }
      public Builder setLoginCheckAccountResponse(com.randioo.sihao_server.protocol.Login.LoginCheckAccountResponse.Builder builderForValue) {
        result.hasLoginCheckAccountResponse = true;
        result.loginCheckAccountResponse_ = builderForValue.build();
        return this;
      }
      public Builder mergeLoginCheckAccountResponse(com.randioo.sihao_server.protocol.Login.LoginCheckAccountResponse value) {
        if (result.hasLoginCheckAccountResponse() &&
            result.loginCheckAccountResponse_ != com.randioo.sihao_server.protocol.Login.LoginCheckAccountResponse.getDefaultInstance()) {
          result.loginCheckAccountResponse_ =
            com.randioo.sihao_server.protocol.Login.LoginCheckAccountResponse.newBuilder(result.loginCheckAccountResponse_).mergeFrom(value).buildPartial();
        } else {
          result.loginCheckAccountResponse_ = value;
        }
        result.hasLoginCheckAccountResponse = true;
        return this;
      }
      public Builder clearLoginCheckAccountResponse() {
        result.hasLoginCheckAccountResponse = false;
        result.loginCheckAccountResponse_ = com.randioo.sihao_server.protocol.Login.LoginCheckAccountResponse.getDefaultInstance();
        return this;
      }
      
      // optional .com.randioo.sihao_server.protocol.LoginCreateRoleResponse loginCreateRoleResponse = 2;
      public boolean hasLoginCreateRoleResponse() {
        return result.hasLoginCreateRoleResponse();
      }
      public com.randioo.sihao_server.protocol.Login.LoginCreateRoleResponse getLoginCreateRoleResponse() {
        return result.getLoginCreateRoleResponse();
      }
      public Builder setLoginCreateRoleResponse(com.randioo.sihao_server.protocol.Login.LoginCreateRoleResponse value) {
        if (value == null) {
          throw new NullPointerException();
        }
        result.hasLoginCreateRoleResponse = true;
        result.loginCreateRoleResponse_ = value;
        return this;
      }
      public Builder setLoginCreateRoleResponse(com.randioo.sihao_server.protocol.Login.LoginCreateRoleResponse.Builder builderForValue) {
        result.hasLoginCreateRoleResponse = true;
        result.loginCreateRoleResponse_ = builderForValue.build();
        return this;
      }
      public Builder mergeLoginCreateRoleResponse(com.randioo.sihao_server.protocol.Login.LoginCreateRoleResponse value) {
        if (result.hasLoginCreateRoleResponse() &&
            result.loginCreateRoleResponse_ != com.randioo.sihao_server.protocol.Login.LoginCreateRoleResponse.getDefaultInstance()) {
          result.loginCreateRoleResponse_ =
            com.randioo.sihao_server.protocol.Login.LoginCreateRoleResponse.newBuilder(result.loginCreateRoleResponse_).mergeFrom(value).buildPartial();
        } else {
          result.loginCreateRoleResponse_ = value;
        }
        result.hasLoginCreateRoleResponse = true;
        return this;
      }
      public Builder clearLoginCreateRoleResponse() {
        result.hasLoginCreateRoleResponse = false;
        result.loginCreateRoleResponse_ = com.randioo.sihao_server.protocol.Login.LoginCreateRoleResponse.getDefaultInstance();
        return this;
      }
      
      // optional .com.randioo.sihao_server.protocol.LoginGetRoleDataResponse loginGetRoleDataResponse = 3;
      public boolean hasLoginGetRoleDataResponse() {
        return result.hasLoginGetRoleDataResponse();
      }
      public com.randioo.sihao_server.protocol.Login.LoginGetRoleDataResponse getLoginGetRoleDataResponse() {
        return result.getLoginGetRoleDataResponse();
      }
      public Builder setLoginGetRoleDataResponse(com.randioo.sihao_server.protocol.Login.LoginGetRoleDataResponse value) {
        if (value == null) {
          throw new NullPointerException();
        }
        result.hasLoginGetRoleDataResponse = true;
        result.loginGetRoleDataResponse_ = value;
        return this;
      }
      public Builder setLoginGetRoleDataResponse(com.randioo.sihao_server.protocol.Login.LoginGetRoleDataResponse.Builder builderForValue) {
        result.hasLoginGetRoleDataResponse = true;
        result.loginGetRoleDataResponse_ = builderForValue.build();
        return this;
      }
      public Builder mergeLoginGetRoleDataResponse(com.randioo.sihao_server.protocol.Login.LoginGetRoleDataResponse value) {
        if (result.hasLoginGetRoleDataResponse() &&
            result.loginGetRoleDataResponse_ != com.randioo.sihao_server.protocol.Login.LoginGetRoleDataResponse.getDefaultInstance()) {
          result.loginGetRoleDataResponse_ =
            com.randioo.sihao_server.protocol.Login.LoginGetRoleDataResponse.newBuilder(result.loginGetRoleDataResponse_).mergeFrom(value).buildPartial();
        } else {
          result.loginGetRoleDataResponse_ = value;
        }
        result.hasLoginGetRoleDataResponse = true;
        return this;
      }
      public Builder clearLoginGetRoleDataResponse() {
        result.hasLoginGetRoleDataResponse = false;
        result.loginGetRoleDataResponse_ = com.randioo.sihao_server.protocol.Login.LoginGetRoleDataResponse.getDefaultInstance();
        return this;
      }
      
      // optional .com.randioo.sihao_server.protocol.PingResponse pingResponse = 4;
      public boolean hasPingResponse() {
        return result.hasPingResponse();
      }
      public com.randioo.sihao_server.protocol.Ping.PingResponse getPingResponse() {
        return result.getPingResponse();
      }
      public Builder setPingResponse(com.randioo.sihao_server.protocol.Ping.PingResponse value) {
        if (value == null) {
          throw new NullPointerException();
        }
        result.hasPingResponse = true;
        result.pingResponse_ = value;
        return this;
      }
      public Builder setPingResponse(com.randioo.sihao_server.protocol.Ping.PingResponse.Builder builderForValue) {
        result.hasPingResponse = true;
        result.pingResponse_ = builderForValue.build();
        return this;
      }
      public Builder mergePingResponse(com.randioo.sihao_server.protocol.Ping.PingResponse value) {
        if (result.hasPingResponse() &&
            result.pingResponse_ != com.randioo.sihao_server.protocol.Ping.PingResponse.getDefaultInstance()) {
          result.pingResponse_ =
            com.randioo.sihao_server.protocol.Ping.PingResponse.newBuilder(result.pingResponse_).mergeFrom(value).buildPartial();
        } else {
          result.pingResponse_ = value;
        }
        result.hasPingResponse = true;
        return this;
      }
      public Builder clearPingResponse() {
        result.hasPingResponse = false;
        result.pingResponse_ = com.randioo.sihao_server.protocol.Ping.PingResponse.getDefaultInstance();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.randioo.sihao_server.protocol.SCMessage)
    }
    
    static {
      defaultInstance = new SCMessage(true);
      com.randioo.sihao_server.protocol.ServerMessage.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.randioo.sihao_server.protocol.SCMessage)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_randioo_sihao_server_protocol_SCMessage_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_randioo_sihao_server_protocol_SCMessage_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023ServerMessage.proto\022!com.randioo.sihao" +
      "_server.protocol\032\013Login.proto\032\nPing.prot" +
      "o\"\357\002\n\tSCMessage\022_\n\031loginCheckAccountResp" +
      "onse\030\001 \001(\0132<.com.randioo.sihao_server.pr" +
      "otocol.LoginCheckAccountResponse\022[\n\027logi" +
      "nCreateRoleResponse\030\002 \001(\0132:.com.randioo." +
      "sihao_server.protocol.LoginCreateRoleRes" +
      "ponse\022]\n\030loginGetRoleDataResponse\030\003 \001(\0132" +
      ";.com.randioo.sihao_server.protocol.Logi" +
      "nGetRoleDataResponse\022E\n\014pingResponse\030\004 \001",
      "(\0132/.com.randioo.sihao_server.protocol.P" +
      "ingResponse"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_randioo_sihao_server_protocol_SCMessage_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_randioo_sihao_server_protocol_SCMessage_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_randioo_sihao_server_protocol_SCMessage_descriptor,
              new java.lang.String[] { "LoginCheckAccountResponse", "LoginCreateRoleResponse", "LoginGetRoleDataResponse", "PingResponse", },
              com.randioo.sihao_server.protocol.ServerMessage.SCMessage.class,
              com.randioo.sihao_server.protocol.ServerMessage.SCMessage.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.randioo.sihao_server.protocol.Login.getDescriptor(),
          com.randioo.sihao_server.protocol.Ping.getDescriptor(),
        }, assigner);
  }
  
  public static void internalForceInit() {}
  
  // @@protoc_insertion_point(outer_class_scope)
}