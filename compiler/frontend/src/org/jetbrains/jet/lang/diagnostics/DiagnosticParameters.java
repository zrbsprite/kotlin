/*
 * Copyright 2010-2012 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.jet.lang.diagnostics;

import org.jetbrains.jet.lang.psi.JetClass;
import org.jetbrains.jet.lang.psi.JetProperty;
import org.jetbrains.jet.lang.types.JetType;
import org.jetbrains.jet.lexer.JetKeywordToken;

/**
 * @author svtk
 */
public interface DiagnosticParameters {
    DiagnosticParameter<JetKeywordToken> MODIFIER = new DiagnosticParameterImpl<JetKeywordToken>("MODIFIER");
    DiagnosticParameter<JetClass> CLASS = new DiagnosticParameterImpl<JetClass>("CLASS");
    DiagnosticParameter<JetType> TYPE = new DiagnosticParameterImpl<JetType>("TYPE");
    DiagnosticParameter<JetProperty> PROPERTY = new DiagnosticParameterImpl<JetProperty>("TYPE");
}
