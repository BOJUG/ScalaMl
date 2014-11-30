/**
 * Copyright 2013, 2014, 2015  by Patrick Nicolas - Scala for Machine Learning - All rights reserved
 *
 * The source code in this file is provided by the author for the sole purpose of illustrating the 
 * concepts and algorithms presented in "Scala for Machine Learning" ISBN: 978-1-783355-874-2 Packt Publishing.
 * Unless required by applicable law or agreed to in writing, software is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * Version 0.96a
 */
package org.scalaml.supervised.regression


import org.scalaml.core.Types.ScalaMl.DblVector
import org.scalaml.core.design.Model


		/**
		 * <p>Generic class that defines a model for linear, logistic and regularized regression.<br>
		 * @param weights Weights or parameters of the regression computed during the training of the model (class instantiation)<br>
		 * @param rss Residual sum of the squares computed during training</p>
		 * @constructor Create a (linear or logistic) regression model. 
		 * 
		 * @author Patrick Nicolas
		 * @since @since January 09, 2014
		 * @note Scala for Machine learning Chapter 6 Regression and regularization.
		 */
case class RegressionModel(val weights: DblVector, val rss: Double) extends Model {
	val persists = "models/regression"

		/**
		 * Return the number of weights or regression parameters in this model
		 * @return Size of the regression weight vector is weights are defined, 0 otherwise
		 */
	@inline
	final val size: Int = if(weights != null) weights.size else 0
}

// ------------------------  EOF ----------------------------------------------------