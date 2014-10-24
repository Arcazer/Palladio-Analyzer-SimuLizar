/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.pcm.prm.util;

import de.upb.pcm.prm.PrmPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PrmXMLProcessor extends XMLProcessor
{

   /**
    * Public constructor to instantiate the helper.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public PrmXMLProcessor()
   {
      super((EPackage.Registry.INSTANCE));
      PrmPackage.eINSTANCE.eClass();
   }
   
   /**
    * Register for "*" and "xml" file extensions the PrmResourceFactoryImpl factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected Map<String, Resource.Factory> getRegistrations()
   {
      if (registrations == null)
      {
         super.getRegistrations();
         registrations.put(XML_EXTENSION, new PrmResourceFactoryImpl());
         registrations.put(STAR_EXTENSION, new PrmResourceFactoryImpl());
      }
      return registrations;
   }

} //PrmXMLProcessor