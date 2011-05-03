/*
* JBoss, Home of Professional Open Source
* Copyright $today.year Red Hat Inc. and/or its affiliates and other
* contributors as indicated by the @author tags. All rights reserved.
* See the copyright.txt in the distribution for a full listing of
* individual contributors.
* 
* This is free software; you can redistribute it and/or modify it
* under the terms of the GNU Lesser General Public License as
* published by the Free Software Foundation; either version 2.1 of
* the License, or (at your option) any later version.
* 
* This software is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
* Lesser General Public License for more details.
* 
* You should have received a copy of the GNU Lesser General Public
* License along with this software; if not, write to the Free
* Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
* 02110-1301 USA, or see the FSF site: http://www.fsf.org.
*/

package org.jboss.vdf2dp;


import java.util.Map;

import org.jboss.as.server.deployment.Attachable;
import org.jboss.as.server.deployment.AttachmentKey;
import org.jboss.deployers.spi.attachments.MutableAttachments;

/**
 * Adapt VDF Attachments to AS7 Attachable.
 *
 * @author <a href="mailto:ales.justin@jboss.org">Ales Justin</a>
 */
public abstract class AttachmentsAdapter implements MutableAttachments
{
   private Attachable attachable;

   protected AttachmentsAdapter(Attachable attachable)
   {
      if (attachable == null)
         throw new IllegalArgumentException("Null attachable");
      this.attachable = attachable;
   }

   public Object addAttachment(String name, Object attachment)
   {
      return attachable.putAttachment(null, attachment);
   }

   public <T> T addAttachment(String name, T attachment, Class<T> expectedType)
   {
      return null;  //To change body of implemented methods use File | Settings | File Templates.
   }

   public <T> T addAttachment(Class<T> type, T attachment)
   {
      return null;  //To change body of implemented methods use File | Settings | File Templates.
   }

   public Object removeAttachment(String name)
   {
      return null;  //To change body of implemented methods use File | Settings | File Templates.
   }

   public <T> T removeAttachment(String name, Class<T> expectedType)
   {
      return null;  //To change body of implemented methods use File | Settings | File Templates.
   }

   public <T> T removeAttachment(Class<T> type)
   {
      return null;  //To change body of implemented methods use File | Settings | File Templates.
   }

   public void setAttachments(Map<String, Object> map)
   {
      //To change body of implemented methods use File | Settings | File Templates.
   }

   public void clear()
   {
      //To change body of implemented methods use File | Settings | File Templates.
   }

   public int getChangeCount()
   {
      return 0;  //To change body of implemented methods use File | Settings | File Templates.
   }

   public void clearChangeCount()
   {
      //To change body of implemented methods use File | Settings | File Templates.
   }

   public Map<String, Object> getAttachments()
   {
      return null;  //To change body of implemented methods use File | Settings | File Templates.
   }

   public Object getAttachment(String name)
   {
      return null;  //To change body of implemented methods use File | Settings | File Templates.
   }

   public <T> T getAttachment(String name, Class<T> expectedType)
   {
      return null;  //To change body of implemented methods use File | Settings | File Templates.
   }

   public <T> T getAttachment(Class<T> type)
   {
      return null;  //To change body of implemented methods use File | Settings | File Templates.
   }

   public boolean isAttachmentPresent(String name)
   {
      return false;  //To change body of implemented methods use File | Settings | File Templates.
   }

   public boolean isAttachmentPresent(String name, Class<?> expectedType)
   {
      return false;  //To change body of implemented methods use File | Settings | File Templates.
   }

   public boolean isAttachmentPresent(Class<?> type)
   {
      return false;  //To change body of implemented methods use File | Settings | File Templates.
   }

   public boolean hasAttachments()
   {
      return false;  //To change body of implemented methods use File | Settings | File Templates.
   }
}
