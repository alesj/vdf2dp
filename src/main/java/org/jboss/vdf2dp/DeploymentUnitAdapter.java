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


import java.util.List;
import java.util.Set;

import org.jboss.as.server.deployment.DeploymentPhaseContext;
import org.jboss.dependency.spi.DependencyInfo;
import org.jboss.dependency.spi.DependencyItem;
import org.jboss.deployers.client.spi.main.MainDeployer;
import org.jboss.deployers.spi.DeploymentException;
import org.jboss.deployers.spi.attachments.MutableAttachments;
import org.jboss.deployers.spi.deployer.DeploymentStage;
import org.jboss.deployers.spi.structure.MetaDataTypeFilter;
import org.jboss.deployers.structure.spi.ClassLoaderFactory;
import org.jboss.deployers.structure.spi.DeploymentUnit;
import org.jboss.deployers.structure.spi.DeploymentUnitVisitor;
import org.jboss.deployers.vfs.spi.structure.VFSDeploymentResourceLoader;
import org.jboss.deployers.vfs.spi.structure.VFSDeploymentUnit;
import org.jboss.metadata.spi.MetaData;
import org.jboss.metadata.spi.MutableMetaData;
import org.jboss.metadata.spi.scope.ScopeKey;
import org.jboss.vfs.VirtualFile;
import org.jboss.vfs.VirtualFileFilter;

/**
 * Adapt VDF Deployer to AS7 DUP.
 *
 * @author <a href="mailto:ales.justin@jboss.org">Ales Justin</a>
 */
public class DeploymentUnitAdapter extends AttachmentsAdapter implements VFSDeploymentUnit
{
   private org.jboss.as.server.deployment.DeploymentUnit unit;

   public DeploymentUnitAdapter(org.jboss.as.server.deployment.DeploymentUnit unit)
   {
      super(unit);
      this.unit = unit;
   }

   public String getName()
   {
      return unit.getName();
   }

   public String getSimpleName()
   {
      return getName();
   }

   public String getRelativePath()
   {
      return null;  //To change body of implemented methods use File | Settings | File Templates.
   }

   public ScopeKey getScope()
   {
      return null;  //To change body of implemented methods use File | Settings | File Templates.
   }

   public void setScope(ScopeKey key)
   {
      //To change body of implemented methods use File | Settings | File Templates.
   }

   public ScopeKey getMutableScope()
   {
      return null;  //To change body of implemented methods use File | Settings | File Templates.
   }

   public void setMutableScope(ScopeKey key)
   {
      //To change body of implemented methods use File | Settings | File Templates.
   }

   public MetaData getMetaData()
   {
      return null;  //To change body of implemented methods use File | Settings | File Templates.
   }

   public MutableMetaData getMutableMetaData()
   {
      return null;  //To change body of implemented methods use File | Settings | File Templates.
   }

   public ClassLoader getClassLoader()
   {
      return null;  //To change body of implemented methods use File | Settings | File Templates.
   }

   public boolean createClassLoader(ClassLoaderFactory factory) throws DeploymentException
   {
      return false;  //To change body of implemented methods use File | Settings | File Templates.
   }

   public void removeClassLoader(ClassLoaderFactory factory)
   {
      //To change body of implemented methods use File | Settings | File Templates.
   }

   public <T> Set<? extends T> getAllMetaData(Class<T> type)
   {
      return null;  //To change body of implemented methods use File | Settings | File Templates.
   }

   public MutableAttachments getTransientManagedObjects()
   {
      return null;  //To change body of implemented methods use File | Settings | File Templates.
   }

   public boolean isTopLevel()
   {
      return false;  //To change body of implemented methods use File | Settings | File Templates.
   }

   public VFSDeploymentUnit getTopLevel()
   {
      return null;  //To change body of implemented methods use File | Settings | File Templates.
   }

   public VFSDeploymentUnit getParent()
   {
      return null;  //To change body of implemented methods use File | Settings | File Templates.
   }

   public List<DeploymentUnit> getChildren()
   {
      return null;  //To change body of implemented methods use File | Settings | File Templates.
   }

   public List<DeploymentUnit> getComponents()
   {
      return null;  //To change body of implemented methods use File | Settings | File Templates.
   }

   public boolean isComponent()
   {
      return false;  //To change body of implemented methods use File | Settings | File Templates.
   }

   public DeploymentUnit addComponent(String name)
   {
      return null;  //To change body of implemented methods use File | Settings | File Templates.
   }

   public DeploymentUnit getComponent(String name)
   {
      return null;  //To change body of implemented methods use File | Settings | File Templates.
   }

   public boolean removeComponent(String name)
   {
      return false;  //To change body of implemented methods use File | Settings | File Templates.
   }

   public VFSDeploymentResourceLoader getResourceLoader()
   {
      return null;  //To change body of implemented methods use File | Settings | File Templates.
   }

   public ClassLoader getResourceClassLoader()
   {
      return null;  //To change body of implemented methods use File | Settings | File Templates.
   }

   public void visit(DeploymentUnitVisitor visitor) throws DeploymentException
   {
      //To change body of implemented methods use File | Settings | File Templates.
   }

   public MainDeployer getMainDeployer()
   {
      return null;  //To change body of implemented methods use File | Settings | File Templates.
   }

   public Object getControllerContextName()
   {
      return null;  //To change body of implemented methods use File | Settings | File Templates.
   }

   public DeploymentStage getRequiredStage()
   {
      return null;  //To change body of implemented methods use File | Settings | File Templates.
   }

   public void setRequiredStage(DeploymentStage stage)
   {
      //To change body of implemented methods use File | Settings | File Templates.
   }

   public DependencyInfo getDependencyInfo()
   {
      return null;  //To change body of implemented methods use File | Settings | File Templates.
   }

   public void addIDependOn(DependencyItem dependency)
   {
      //To change body of implemented methods use File | Settings | File Templates.
   }

   public void removeIDependOn(DependencyItem dependency)
   {
      //To change body of implemented methods use File | Settings | File Templates.
   }

   public Set<Object> getControllerContextNames()
   {
      return null;  //To change body of implemented methods use File | Settings | File Templates.
   }

   public void addControllerContextName(Object name)
   {
      //To change body of implemented methods use File | Settings | File Templates.
   }

   public void removeControllerContextName(Object name)
   {
      //To change body of implemented methods use File | Settings | File Templates.
   }

   public VirtualFile getMetaDataFile(String name)
   {
      return null;  //To change body of implemented methods use File | Settings | File Templates.
   }

   public VirtualFile getMetaDataFile(String name, MetaDataTypeFilter filter)
   {
      return null;  //To change body of implemented methods use File | Settings | File Templates.
   }

   public List<VirtualFile> getMetaDataFiles(String name, String suffix)
   {
      return null;  //To change body of implemented methods use File | Settings | File Templates.
   }

   public List<VirtualFile> getMetaDataFiles(String name, String suffix, MetaDataTypeFilter filter)
   {
      return null;  //To change body of implemented methods use File | Settings | File Templates.
   }

   public List<VirtualFile> getMetaDataFiles(VirtualFileFilter filter)
   {
      return null;  //To change body of implemented methods use File | Settings | File Templates.
   }

   public List<VirtualFile> getMetaDataFiles(VirtualFileFilter filter, MetaDataTypeFilter mdtf)
   {
      return null;  //To change body of implemented methods use File | Settings | File Templates.
   }

   public void prependMetaDataLocation(VirtualFile... locations)
   {
      //To change body of implemented methods use File | Settings | File Templates.
   }

   public void appendMetaDataLocation(VirtualFile... locations)
   {
      //To change body of implemented methods use File | Settings | File Templates.
   }

   public void removeMetaDataLocation(VirtualFile... locations)
   {
      //To change body of implemented methods use File | Settings | File Templates.
   }

   public VirtualFile getFile(String path)
   {
      return null;  //To change body of implemented methods use File | Settings | File Templates.
   }

   public VirtualFile getRoot()
   {
      return null;  //To change body of implemented methods use File | Settings | File Templates.
   }

   public List<VirtualFile> getClassPath()
   {
      return null;  //To change body of implemented methods use File | Settings | File Templates.
   }

   public void setClassPath(List<VirtualFile> classPath)
   {
      //To change body of implemented methods use File | Settings | File Templates.
   }

   public void prependClassPath(VirtualFile... files)
   {
      //To change body of implemented methods use File | Settings | File Templates.
   }

   public void prependClassPath(List<VirtualFile> files)
   {
      //To change body of implemented methods use File | Settings | File Templates.
   }

   public void appendClassPath(VirtualFile... files)
   {
      //To change body of implemented methods use File | Settings | File Templates.
   }

   public void appendClassPath(List<VirtualFile> files)
   {
      //To change body of implemented methods use File | Settings | File Templates.
   }

   public void addClassPath(VirtualFile... files)
   {
      //To change body of implemented methods use File | Settings | File Templates.
   }

   public void addClassPath(List<VirtualFile> files)
   {
      //To change body of implemented methods use File | Settings | File Templates.
   }

   public void removeClassPath(VirtualFile... files)
   {
      //To change body of implemented methods use File | Settings | File Templates.
   }

   public List<VFSDeploymentUnit> getVFSChildren()
   {
      return null;  //To change body of implemented methods use File | Settings | File Templates.
   }
}
