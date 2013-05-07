/*
 * Copyright (c) 2002-2013, Mairie de Paris
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  1. Redistributions of source code must retain the above copyright notice
 *     and the following disclaimer.
 *
 *  2. Redistributions in binary form must reproduce the above copyright notice
 *     and the following disclaimer in the documentation and/or other materials
 *     provided with the distribution.
 *
 *  3. Neither the name of 'Mairie de Paris' nor 'Lutece' nor the names of its
 *     contributors may be used to endorse or promote products derived from
 *     this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 * License 1.0
 */
package fr.paris.lutece.plugins.extend.modules.comment.business.config;

import fr.paris.lutece.plugins.extend.business.extender.config.ExtenderConfig;


/**
 *
 * CommentExtenderConfig
 *
 */
public class CommentExtenderConfig extends ExtenderConfig
{
    private boolean _bIsModerated;
    private int _nNbComments;
    private int _nIdMailingList = -1;

    /**
     * Checks if is moderated.
     *
     * @return true, if is moderated
     */
    public boolean isModerated(  )
    {
        return _bIsModerated;
    }

    /**
     * Sets the moderated.
     *
     * @param bModerated the new moderated
     */
    public void setModerated( boolean bModerated )
    {
        _bIsModerated = bModerated;
    }

    /**
     * @return the nNbComments
     */
    public int getNbComments(  )
    {
        return _nNbComments;
    }

    /**
     * @param nNbComments the nNbComments to set
     */
    public void setNbComments( int nNbComments )
    {
        _nNbComments = nNbComments;
    }

    /**
     * @return the nIdMailingList
     */
    public int getIdMailingList(  )
    {
        return _nIdMailingList;
    }

    /**
     * @param nIdMailingList the nIdMailingList to set
     */
    public void setIdMailingList( int nIdMailingList )
    {
        _nIdMailingList = nIdMailingList;
    }
}
