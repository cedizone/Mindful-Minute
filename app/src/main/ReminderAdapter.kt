class ReminderAdapter(private val reminders: List<Reminder>) :
    RecyclerView.Adapter<ReminderAdapter.ReminderViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReminderViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.reminder_item, parent, false)
        return ReminderViewHolder(view)
    }

    override fun onBindViewHolder(holder: ReminderViewHolder, position: Int) {
        val reminder = reminders[position]
        holder.icon.setImageResource(reminder.icon)
        holder.title.text = reminder.title
        holder.dateTime.text = "${reminder.date}, ${reminder.time}"
        holder.itemView.setOnClickListener {
            val context = holder.itemView.context
            val intent = Intent(context, MeditationActivity::class.java)
            intent.putExtra("title", reminder.title)
            intent.putExtra("date", reminder.date)
            intent.putExtra("time", reminder.time)
            intent.putExtra("icon", reminder.icon)
            context.startActivity(intent)
        }
    }


    override fun getItemCount(): Int {
        return reminders.size
    }

    inner class ReminderViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val icon: ImageView = itemView.findViewById(R.id.icon)
        val title: TextView = itemView.findViewById(R.id.title)
        val date: TextView = itemView.findViewById(R.id.date)
        val time: TextView = itemView.findViewById(R.id.time)
    }
}
