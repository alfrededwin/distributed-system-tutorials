// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BankService.proto

package ds.tutorial.communication.grpc.generated;

public final class BankService {
  private BankService() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ds_tutorial_communication_grpc_generated_CheckBalanceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ds_tutorial_communication_grpc_generated_CheckBalanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ds_tutorial_communication_grpc_generated_CheckBalanceResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ds_tutorial_communication_grpc_generated_CheckBalanceResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021BankService.proto\022(ds.tutorial.communi" +
      "cation.grpc.generated\"(\n\023CheckBalanceReq" +
      "uest\022\021\n\taccountId\030\001 \001(\t\"\'\n\024CheckBalanceR" +
      "esponse\022\017\n\007balance\030\001 \001(\0012\240\001\n\016BalanceServ" +
      "ice\022\215\001\n\014checkBalance\022=.ds.tutorial.commu" +
      "nication.grpc.generated.CheckBalanceRequ" +
      "est\032>.ds.tutorial.communication.grpc.gen" +
      "erated.CheckBalanceResponseB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ds_tutorial_communication_grpc_generated_CheckBalanceRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ds_tutorial_communication_grpc_generated_CheckBalanceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ds_tutorial_communication_grpc_generated_CheckBalanceRequest_descriptor,
        new java.lang.String[] { "AccountId", });
    internal_static_ds_tutorial_communication_grpc_generated_CheckBalanceResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ds_tutorial_communication_grpc_generated_CheckBalanceResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ds_tutorial_communication_grpc_generated_CheckBalanceResponse_descriptor,
        new java.lang.String[] { "Balance", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
