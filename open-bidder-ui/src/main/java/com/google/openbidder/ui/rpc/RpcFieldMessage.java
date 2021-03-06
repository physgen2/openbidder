/*
 * Copyright 2012 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.openbidder.ui.rpc;

import static com.google.common.base.Preconditions.checkNotNull;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;

/**
 * Form field messages.
 */
public class RpcFieldMessage {

  private final RpcFieldMessageType messageType;
  private final ImmutableList<String> messages;

  public RpcFieldMessage(RpcFieldMessageType messageType, Iterable<String> messages) {
    this.messageType = checkNotNull(messageType);
    this.messages = ImmutableList.copyOf(messages);
  }

  public RpcFieldMessageType getMessageType() {
    return messageType;
  }

  public ImmutableList<String> getMessages() {
    return messages;
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this).omitNullValues()
        .add("messageType", messageType)
        .add("messages", messages)
        .toString();
  }
}
