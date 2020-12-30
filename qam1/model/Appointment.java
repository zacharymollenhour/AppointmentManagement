package qam1.model;

import java.time.LocalTime;

/**
 * Project: Qam1
 * Package: qam1.model
 * <p>
 * Author: Zachary Mollenhour
 * Date: 12/30/2020
 * Time: 9:59 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class Appointment {

    //Declare Private Variables
    private int Appointment_ID;
    private String Title;
    private String Description;
    private String Location;
    private String Type;
    private LocalTime Time;
    private int User_ID;
    private int Customer_ID;
    private String Customer_Name;
    private String Start_Time;
    private String End_Time;

    /**
     * Default Constructor for Appointment Class.
     * Assigns values to Object for Appointments
     * @param Appointment_ID
     * @param Title
     * @param Description
     * @param Location
     * @param Type
     * @param Time
     * @param User_ID
     * @param Customer_ID
     * @param Customer_Name
     * @param Start_Time
     * @param End_Time
     */
    public Appointment(int Appointment_ID, String Title, String Description, String Location, String Type, LocalTime Time, int User_ID, int Customer_ID, String Customer_Name, String Start_Time, String End_Time)
    {
        this.Appointment_ID = Appointment_ID;
        this.Title = Title;
        this.Description = Description;
        this.Location = Location;
        this.Type = Type;
        this.Time = Time;
        this.User_ID = User_ID;
        this.Customer_ID = Customer_ID;
        this.Customer_Name = Customer_Name;
        this.Start_Time = Start_Time;
        this.End_Time = End_Time;
    }

    //Get Helper Functions For Appointment Class

    /**
     * Get Appointment ID Value.
     * Returns Appointment_ID Value
     * @return
     */
    public int getAppointment_ID(){
        return Appointment_ID;
    }

    /**
     * Get Appointment Title
     * @return
     */
    public String getTitle()
    {
        return Title;
    }

    /**
     * Get Appointment Description
     * @return
     */
    public String getDescription()
    {
        return Description;
    }

    /**
     * Get Appointment Location
     * @return
     */
    public String getLocation()
    {
        return Location;
    }

    /**
     * Get Appointment Type
     * @return
     */
    public String getType()
    {
        return Type;
    }

    /**
     * Get Appointments Customer Name
     * @return
     */
    public String getCustomer_Name()
    {
        return Customer_Name;
    }

    /**
     * Get Appointment Start Time
     */
    public String getStart_Time()
    {
        return Start_Time;
    }

    /**
     * Get Appointment End Time
     * @return
     */
    public String getEnd_Time()
    {
        return End_Time;
    }

    public int getUser_ID(int user_ID)
    {
        return User_ID;
    }

    public int getCustomer_ID(int customer_ID)
    {
        return Customer_ID;
    }
    //Set Helper Functions for Appointment Class

    /**
     * Set Appointment ID
     * @param appointment_ID
     */
    public void setAppointment_ID(int appointment_ID)
    {
        this.Appointment_ID = appointment_ID;
    }

    /**
     * Set Appointment Title
     * @param title
     */
    public void setTitle(String title)
    {
        this.Title = title;
    }

    /**
     * Set Appointment Description
     * @param description
     */
    public void setDescription(String description)
    {
        this.Description = description;
    }

    /**
     * Set Appointment Location
     * @param location
     */
    public void setLocation(String location)
    {
        this.Location = location;
    }

    public void setType(String type)
    {
        this.Type = type;
    }

    public void setStart_Time(String start_Time)
    {
        this.Start_Time = start_Time;
    }

    public void setEnd_Time(String end_Time)
    {
        this.End_Time = end_Time;
    }

    public void setUser_ID(int user_ID)
    {
        this.User_ID = user_ID;
    }

    public void setCustomer_ID(int customer_ID)
    {
        this.Customer_ID = customer_ID;
    }

    public void setCustomer_Name(String customer_Name)
    {
        this.Customer_Name = customer_Name;
    }


}
