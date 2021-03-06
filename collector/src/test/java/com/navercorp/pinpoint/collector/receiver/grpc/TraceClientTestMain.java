/*
 * Copyright 2019 NAVER Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.navercorp.pinpoint.collector.receiver.grpc;

import java.util.concurrent.TimeUnit;

public class TraceClientTestMain {
    private static final int MAX = 100000;

    public static void main(String[] args) throws Exception {
        TraceClientMock clientMock = new TraceClientMock("0.0.0.0", 9998);
        clientMock.span(1);

        clientMock.spanChunk(1);

        TimeUnit.SECONDS.sleep(60);
        clientMock.stop();
    }
}
