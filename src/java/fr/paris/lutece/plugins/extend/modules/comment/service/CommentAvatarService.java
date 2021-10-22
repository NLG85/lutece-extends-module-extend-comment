/*
 * Copyright (c) 2002-2021, City of Paris
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
package fr.paris.lutece.plugins.extend.modules.comment.service;

import org.apache.commons.lang3.StringUtils;

import fr.paris.lutece.plugins.avatar.service.AvatarService;
import fr.paris.lutece.plugins.extend.modules.comment.business.Comment;
import fr.paris.lutece.plugins.extend.modules.comment.util.constants.CommentConstants;
import fr.paris.lutece.portal.service.util.AppPropertiesService;

/**
 * 
 * CommentAvatarService
 *
 */
public class CommentAvatarService implements ICommentAvatarService
{

    private static ICommentAvatarService _singleton;
    private static boolean _bUseLuteceUserNameAsAvatarKey;

    /**
     * {@inheritDoc}
     */
    @Override
    public String getAvatar( Comment comment )
    {
        if ( _bUseLuteceUserNameAsAvatarKey && !StringUtils.isEmpty( comment.getLuteceUserName( ) ) )
        {
            return AvatarService.getAvatar( comment.getLuteceUserName( ) );
        }
        return AvatarService.getAvatar( comment.getEmail( ) );
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getAvatarUrl( Comment comment )
    {
        if ( _bUseLuteceUserNameAsAvatarKey && !StringUtils.isEmpty( comment.getLuteceUserName( ) ) )
        {
            return AvatarService.getAvatarUrl( comment.getLuteceUserName( ) );
        }
        return AvatarService.getAvatarUrl( comment.getEmail( ) );
    }

    /**
     * 
     * @return singleton
     */
    public static ICommentAvatarService getInstance( )
    {

        if ( _singleton == null )
        {

            _singleton = new CommentAvatarService( );
            _bUseLuteceUserNameAsAvatarKey = AppPropertiesService.getPropertyBoolean( CommentConstants.PROPERTY_USE_LUTECE_USER_NAME_AS_AVATAR_KEY, false );
        }

        return _singleton;

    }

}
