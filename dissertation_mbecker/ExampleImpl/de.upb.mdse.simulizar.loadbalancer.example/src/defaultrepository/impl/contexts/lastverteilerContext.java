
      package defaultrepository.impl.contexts;

      // Component context class for lastverteiler
      public class lastverteilerContext implements defaultrepository.impl.contexts.IlastverteilerContext, java.io.Serializable
      {
         
   protected defaultrepository.IServer ben�tigt_IServer1_Lastverteiler = null;

   protected defaultrepository.IServer ben�tigt_IServer2_Lastverteiler = null;

         
         
   public defaultrepository.IServer getRoleBen�tigt_IServer1_Lastverteiler() {
   	  if (ben�tigt_IServer1_Lastverteiler == null) {
   	  	  throw new RuntimeException("Attempt to retrieve unbounded port. Check your architecture! "+
   	  	  		"Role Ben�tigt_IServer1_Lastverteiler <_6EqiAOuTEeCuhfIsXFGDcQ> RequiringEntity lastverteiler");
      }
      return ben�tigt_IServer1_Lastverteiler;
   }

   public defaultrepository.IServer getRoleBen�tigt_IServer2_Lastverteiler() {
   	  if (ben�tigt_IServer2_Lastverteiler == null) {
   	  	  throw new RuntimeException("Attempt to retrieve unbounded port. Check your architecture! "+
   	  	  		"Role Ben�tigt_IServer2_Lastverteiler <_Q4Mx8OuZEeCuhfIsXFGDcQ> RequiringEntity lastverteiler");
      }
      return ben�tigt_IServer2_Lastverteiler;
   }

         
         
   public void setRoleBen�tigt_IServer1_Lastverteiler(defaultrepository.IServer newValue) {
      this.ben�tigt_IServer1_Lastverteiler = newValue;
   }

   public void setRoleBen�tigt_IServer2_Lastverteiler(defaultrepository.IServer newValue) {
      this.ben�tigt_IServer2_Lastverteiler = newValue;
   }

         

         public lastverteilerContext () {
         }
         
         
         public lastverteilerContext (
            
   defaultrepository.IServer ben�tigt_IServer1_Lastverteiler
,
   defaultrepository.IServer ben�tigt_IServer2_Lastverteiler

            
            ) {
            
   this.ben�tigt_IServer1_Lastverteiler = ben�tigt_IServer1_Lastverteiler;

   this.ben�tigt_IServer2_Lastverteiler = ben�tigt_IServer2_Lastverteiler;

            
         }
         
         
         

      }
   