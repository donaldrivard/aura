/*
 * Copyright (C) 2013 salesforce.com, inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.auraframework.def;

import org.auraframework.builder.ComponentDefRefBuilder;
import org.auraframework.instance.ComponentConfig;
import org.auraframework.throwable.quickfix.QuickFixException;

/**
 */
public interface ProviderDef extends CodeDefinition {
    @Override
    DefDescriptor<? extends ProviderDef> getDescriptor();

    ComponentConfig provide(DefDescriptor<? extends RootDefinition> intfDescriptor) throws QuickFixException;

    ComponentConfig provide(ComponentDefRefBuilder ref) throws QuickFixException;

    boolean supportsRefProvide();
}
