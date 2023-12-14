package org.example

import software.amazon.awscdk.Stack
import software.amazon.awscdk.StackProps
import software.constructs.Construct

//import software.amazon.awscdk.Duration
//import software.amazon.awscdk.services.sqs.Queue

class CdkStack(scope: Construct, id: String, props: StackProps? = null) : Stack(scope, id, props) {
    init {
        // The code that defines your stack goes here

        // example resource
        // val queue: Queue = Queue.Builder.create(this, "CdkQueue")
        //     .visibilityTimeout(Duration.seconds(300))
        //     .build()
    }
}
