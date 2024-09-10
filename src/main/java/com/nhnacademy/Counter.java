/*
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * + Copyright 2024. NHN Academy Corp. All rights reserved.
 * + * While every precaution has been taken in the preparation of this resource,  assumes no
 * + responsibility for errors or omissions, or for damages resulting from the use of the information
 * + contained herein
 * + No part of this resource may be reproduced, stored in a retrieval system, or transmitted, in any
 * + form or by any means, electronic, mechanical, photocopying, recording, or otherwise, without the
 * + prior written permission.
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */

/*
package com.nhnacademy;

import java.lang.Thread;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Counter {
    public final long countMaxSize;
    public long count;

    public Counter(long countMaxSize) {
        // TODO #1: Validate that countMaxSize is non-negative
        if(countMaxSize < 0) {
            throw new IllegalArgumentException("countMaxSize must be non-negative");
        }

        // TODO #2: Initialize this.countMaxSize
        this.countMaxSize = countMaxSize;

        // TODO #3: Initialize this.count
        this.count = 0;
    }

    public void run() {
        do {
            try {
                // TODO #4: Sleep for 1 second
                Thread.sleep(java.time.Duration.ofSeconds(1).toMillis());
            } catch (InterruptedException e) {
                // Handle the interruption
                Thread.currentThread().interrupt(); // Restore the interrupted status
                log.error("Thread was interrupted, failed to complete operation.", e);
                return; // Exit the method if interrupted
            }

            // Increment the count
            count++;

            // TODO #5: Print the count and the thread's name
            log.info("name:{}, count:{}", Thread.currentThread().getName(), count);

        } while (count < countMaxSize);
    }
}
*/