/*******************************************************************************
 * <copyright>
 *
 * Copyright (c) 2005, 2010 SAP AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    SAP AG - initial API, implementation and documentation
 *
 * </copyright>
 *
 *******************************************************************************/
package org.eclipse.graphiti.util;

import org.eclipse.graphiti.services.IGaService;

/**
 * The IDs of the predefined rendering styles. See
 * {@link IGaService#setRenderingStyle(AbstractStyle, org.eclipse.graphiti.mm.pictograms.AdaptedGradientColoredAreas)}.
 * 
 * 
 */
public interface IPredefinedRenderingStyle {

	/**
	 * The ID for a blue-to-white gradient with a gloss-effect.
	 */
	public static final String BLUE_WHITE_GLOSS_ID = "blue-white-gloss"; //$NON-NLS-1$

	/**
	 * The ID for a blue-to-white gradient.
	 */
	public static final String BLUE_WHITE_ID = "blue-white"; //$NON-NLS-1$

	/**
	 * The ID for a light yellow color.
	 */
	public static final String LIGHT_YELLOW_ID = "light-yellow"; //$NON-NLS-1$

	/**
	 * The ID for a light gray color.
	 */
	public static final String LIGHT_GRAY_ID = "light-gray"; //$NON-NLS-1$

	/**
	 * The ID for a copper-to-white gradient with a gloss-effect.
	 */
	public static final String COPPER_WHITE_GLOSS_ID = "copper-white-gloss"; //$NON-NLS-1$

	/**
	 * The ID for a silver-to-white gradient with a gloss-effect.
	 */
	public static final String SILVER_WHITE_GLOSS_ID = "silver-white-gloss"; //$NON-NLS-1$

	/**
	 * The style-adaptation to use for default elements.
	 */
	public static final int STYLE_ADAPTATION_DEFAULT = 0;

	/**
	 * The style-adaptation to use for primary selected elements.
	 */
	public static final int STYLE_ADAPTATION_PRIMARY_SELECTED = 1;

	/**
	 * The style-adaptation to use for secondary selected elements.
	 */
	public static final int STYLE_ADAPTATION_SECONDARY_SELECTED = 2;

	/**
	 * The style-adaptation to use to indicate that an action is allowed.
	 */
	public static final int STYLE_ADAPTATION_ACTION_ALLOWED = 3;

	/**
	 * The style-adaptation to use to indicate that an action is forbidden.
	 */
	public static final int STYLE_ADAPTATION_ACTION_FORBIDDEN = 4;

}
