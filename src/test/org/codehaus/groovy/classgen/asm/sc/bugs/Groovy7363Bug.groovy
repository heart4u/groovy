/*
 * Copyright 2003-2015 the original author or authors.
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
package org.codehaus.groovy.classgen.asm.sc.bugs

import groovy.transform.stc.StaticTypeCheckingTestCase
import org.codehaus.groovy.classgen.asm.sc.StaticCompilationTestSupport

class Groovy7363Bug extends StaticTypeCheckingTestCase implements StaticCompilationTestSupport {
    void testCascadingGenericTypes() {
        assertScript """import org.codehaus.groovy.classgen.asm.sc.bugs.support.Groovy7363Support
            Groovy7363Support.ABC a = new Groovy7363Support.ABC()
            assert ('' + a.b.object.value) == '42'
        """
    }
}
