// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compiler/ir/serialization.common/src/KotlinIr.proto

package org.jetbrains.kotlin.backend.common.serialization.proto;

public interface IrBranchOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.jetbrains.kotlin.backend.common.serialization.proto.IrBranch)
    org.jetbrains.kotlin.protobuf.MessageLiteOrBuilder {

  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression condition = 1;</code>
   */
  boolean hasCondition();
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression condition = 1;</code>
   */
  org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression getCondition();

  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression result = 2;</code>
   */
  boolean hasResult();
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression result = 2;</code>
   */
  org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression getResult();
}