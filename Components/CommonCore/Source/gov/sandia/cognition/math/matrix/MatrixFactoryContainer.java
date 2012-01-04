/*
 * File:            MatrixFactoryContainer.java
 * Authors:         Justin Basilico
 * Project:         Cognitive Foundry Common Core
 * 
 * Copyright 2011 Justin Basilico. All rights reserved.
 */

package gov.sandia.cognition.math.matrix;

/**
 * Interface for a container for a matrix factory.
 *
 * @author  Justin Basilico
 * @version 3.4.0
 */
public interface MatrixFactoryContainer
{

    /**
     * Gets the matrix factory the object to use to create new matrices.
     *
     * @return
     *      The matrix factory.
     */
    public MatrixFactory<? extends Matrix> getMatrixFactory();

}