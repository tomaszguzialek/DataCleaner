/**
 * DataCleaner (community edition)
 * Copyright (C) 2014 Neopost - Customer Information Management
 *
 * This copyrighted material is made available to anyone wishing to use, modify,
 * copy, or redistribute it subject to the terms and conditions of the GNU
 * Lesser General Public License, as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this distribution; if not, write to:
 * Free Software Foundation, Inc.
 * 51 Franklin Street, Fifth Floor
 * Boston, MA  02110-1301  USA
 */
package org.datacleaner.descriptors;

import org.datacleaner.api.Renderable;
import org.datacleaner.api.Renderer;
import org.datacleaner.api.RendererBean;
import org.datacleaner.api.RenderingFormat;

/**
 * Defines an abstract descriptor for renderer beans.
 * 
 * @see RendererBean
 * 
 * 
 * 
 * @param <B>
 *            the Bean type
 */
public interface RendererBeanDescriptor<R extends Renderer<?, ?>> extends ComponentDescriptor<R> {

    public Class<? extends RenderingFormat<?>> getRenderingFormat();

    public Class<? extends Renderable> getRenderableType();

    boolean isOutputApplicableFor(Class<?> requiredClass);
}
