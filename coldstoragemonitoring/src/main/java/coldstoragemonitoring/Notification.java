package coldstoragemonitoring;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Notification implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String sensorType;
   private java.lang.String alert;
   private java.lang.String status;
   private java.lang.String notification;
   private java.lang.String color;

   public Notification()
   {
   }

   public java.lang.String getSensorType()
   {
      return this.sensorType;
   }

   public void setSensorType(java.lang.String sensorType)
   {
      this.sensorType = sensorType;
   }

   public java.lang.String getAlert()
   {
      return this.alert;
   }

   public void setAlert(java.lang.String alert)
   {
      this.alert = alert;
   }

   public java.lang.String getStatus()
   {
      return this.status;
   }

   public void setStatus(java.lang.String status)
   {
      this.status = status;
   }

   public java.lang.String getNotification()
   {
      return this.notification;
   }

   public void setNotification(java.lang.String notification)
   {
      this.notification = notification;
   }

   public java.lang.String getColor()
   {
      return this.color;
   }

   public void setColor(java.lang.String color)
   {
      this.color = color;
   }

   public Notification(java.lang.String sensorType, java.lang.String alert,
         java.lang.String status, java.lang.String notification,
         java.lang.String color)
   {
      this.sensorType = sensorType;
      this.alert = alert;
      this.status = status;
      this.notification = notification;
      this.color = color;
   }

}