/*
 * Copyright 2002-2012 the original author or authors.
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

package org.springframework.integration.samples.helloworld;

/**
 * Simple POJO to be referenced from a Service Activator.
 *
 * @author Mark Fisher
 */
public class HelloService {
/* comment 3 remote */
	public String sayHello(String name) {
        /* comment 1 local */

        int i = 0;
		/* comment 2 remote */
        System.out.println(i);
        return "Hello " + name;
        
		/* comment 4 remote */
		/* comment 5 remote */
	}

}
