/*
 *                 Twidere - Twitter client for Android
 *
 *  Copyright (C) 2012-2015 Mariotaku Lee <mariotaku.lee@gmail.com>
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.mariotaku.microblog.library.twitter.util;

import org.mariotaku.microblog.library.MicroBlogException;
import org.mariotaku.microblog.library.twitter.model.ResponseCode;
import org.mariotaku.restfu.oauth.OAuthToken;

/**
 * Created by mariotaku on 15/5/5.
 */
public class TwitterConverterFactory extends LoganSquareConverterFactory<MicroBlogException> {

    public TwitterConverterFactory() {
        responseConverters.put(ResponseCode.class, new ResponseCode.ResponseConverter());
        responseConverters.put(OAuthToken.class, new OAuthTokenResponseConverter());
    }

}
