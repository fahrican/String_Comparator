// This inner class is required to sort the trainers in a specific order.
private class TeamStaffComparator implements Comparator<EfPlayer>
{
   private static final int TYPE_MANAGER            = 1;
   private static final int TYPE_ASSISTANT_MANAGER  = 2;
   private static final int TYPE_GOALKEEPER_TRAINER = 3;
   private static final int TYPE_FITNESS_TRAINER    = 4;
   private static final int TYPE_ATHLETIC_TRAINER   = 5;
   private static final int TYPE_DEFAULT            = 6;

   @Override
   public int compare(EfPlayer o1, EfPlayer o2)
   {
      return getPriorityFromTeamStaff(o1) - getPriorityFromTeamStaff(o2);
   }

   private int getPriorityFromTeamStaff(EfPlayer player)
   {
      switch (player.getPositionEn())
      {
         case "Manager":
            return TYPE_MANAGER;
         case "Assistant Manager":
            return TYPE_ASSISTANT_MANAGER;
         case "Goalkeeper Trainer":
            return TYPE_GOALKEEPER_TRAINER;
         case "Fitness Trainer":
            return TYPE_FITNESS_TRAINER;
         case "Athletic trainer":
            return TYPE_ATHLETIC_TRAINER;
         default:
            return TYPE_DEFAULT;
      }
   }
}
