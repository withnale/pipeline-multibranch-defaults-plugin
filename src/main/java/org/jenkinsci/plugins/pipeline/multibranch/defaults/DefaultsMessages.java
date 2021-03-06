/*
 * The MIT License
 *
 * Copyright (c) 2016 Saponenko Denis
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package org.jenkinsci.plugins.pipeline.multibranch.defaults;

import org.jvnet.localizer.Localizable;
import org.jvnet.localizer.ResourceBundleHolder;

/**
 * Generated localization support class.
 */
@SuppressWarnings({
    "",
    "PMD",
    "all"
})
public class DefaultsMessages {
    /**
     * The resource bundle reference
     */
    private final static ResourceBundleHolder holder = ResourceBundleHolder.get(DefaultsMessages.class);

    /**
     * Key {@code PipelineMultiBranchDefaultsProject.Description}: {@code Creates a
     * set of Pipeline projects according to detected branches in one SCM
     * repository.}.
     *
     * @return {@code Creates a set of Pipeline projects according to detected
     * branches in one SCM repository.}
     */
    public static String PipelineMultiBranchDefaultsProject_Description() {
        return holder.format("PipelineMultiBranchDefaultsProject.Description");
    }

    /**
     * Key {@code PipelineMultiBranchDefaultsProject.Description}: {@code Creates a
     * set of Pipeline projects according to detected branches in one SCM
     * repository.}.
     *
     * @return {@code Creates a set of Pipeline projects according to detected
     * branches in one SCM repository.}
     */
    public static Localizable _PipelineMultiBranchDefaultsProject_Description() {
        return new Localizable(holder, "PipelineMultiBranchDefaultsProject.Description");
    }

    /**
     * Key {@code PipelineMultiBranchDefaultsProject.DisplayName}: {@code Multibranch
     * Pipeline}.
     *
     * @return {@code Multibranch Pipeline}
     */
    public static String PipelineMultiBranchDefaultsProject_DisplayName() {
        return holder.format("PipelineMultiBranchDefaultsProject.DisplayName");
    }

    /**
     * Key {@code PipelineMultiBranchDefaultsProject.DisplayName}: {@code Multibranch
     * Pipeline}.
     *
     * @return {@code Multibranch Pipeline}
     */
    public static Localizable _PipelineMultiBranchDefaultsProject_DisplayName() {
        return new Localizable(holder, "PipelineMultiBranchDefaultsProject.DisplayName");
    }

}
