# 🧠 Task Manager Pro - Advanced Task Management System

## 📋 Overview
**Task Manager Pro** is a comprehensive **terminal-based task management system** built with **Java**.  
It enables users to manage **projects** and **tasks** with different priorities, due dates, and scheduling features — all through an elegant command-line interface.

---

## 🎯 Features

### 🧱 Core Features
- **Project Management:** Create and manage multiple projects  
- **Task Hierarchy:** Support for *Simple*, *Recurring*, and *Project* tasks  
- **Priority System:** Tasks with priorities — `LOW`, `MEDIUM`, `HIGH`, and `URGENT`  
- **Scheduling:** Due dates and time-based management  
- **Beautiful Terminal UI:** Colorful, structured, and intuitive command-line interface  
- **Task Filtering:** Filter by priority, status, or project  

---

## 🏗️ System Architecture

### 🧩 Class Structure
```text
Task (Abstract)
├── SimpleTask
├── RecurringTask
└── ProjectTask

Project
├── List<Task>
└── Project metadata

TaskManager (Main Controller)
├── Project management
├── Task operations
└── User interface

TaskPriority (Enum)
└── LOW, MEDIUM, HIGH, URGENT

TaskStatus (Enum)
└── PENDING, IN_PROGRESS, COMPLETED
```

---

## 💻 User Interface

### 🏠 Main Menu
```text
╔══════════════════════════════════════════════╗
║              TASK MANAGER PRO                ║
╚══════════════════════════════════════════════╝
 1. 📁 Manage Projects                       
 2. ✅ Manage Tasks                           
 3. 📊 View Dashboard                         
 4. 🔍 Search & Filter Tasks                  
 0. 🚪 Exit                                   

Enter your choice:
```

### 🗂️ Project Management Menu
```text
╔══════════════════════════════════════════════╗
║               PROJECT MANAGER                ║
╚══════════════════════════════════════════════╝
 1. ➕ Create New Project                     
 2. 👁️ View All Projects                     
 3. 📝 Edit Project                          
 4. 🗑️ Delete Project                        
 5. 📋 View Project Details                  
 0. ↩️ Back to Main Menu                     

```

### 🧾 Task Management Menu
```text
╔══════════════════════════════════════════════╗
║                TASK MANAGER                  ║
╚══════════════════════════════════════════════╝
 1. ➕ Add New Task                           
 2. 👁️ View All Tasks                        
 3. ✏️ Edit Task                             
 4. ✅ Mark Task as Complete                 
 5. 🗑️ Delete Task                           
 6. 📅 View Tasks by Priority                
 0. ↩️ Back to Main Menu                     

```

---

## 📊 Sample Outputs

### 📁 Project List
```text
┌───────────────────────────────────────────────┐
│                 YOUR PROJECTS                 │
└───────────────────────────────────────────────┘
 🎯 University Assignments                     
   📝 Description: All university tasks         
   ✅ Tasks: 8 | 📊 Completion: 62%             
 🎯 Personal Projects                          
   📝 Description: Personal coding projects     
   ✅ Tasks: 5 | 📊 Completion: 20%             
```

### 📋 Task Details
```text
┌───────────────────────────────────────────────┐
│                 TASK DETAILS                  │
└───────────────────────────────────────────────┘
 📋 Title: Complete Java Project               
 📝 Description: Finish the Task Manager mini  
 🏷️ Type: Simple Task                         
 ⚡ Priority: HIGH      🔴 Status: IN_PROGRESS 
 📅 Due Date: 2024-01-15 18:00                
 📁 Project: University Assignments            
 🕐 Created: 2024-01-10 14:30                  

```

### ⚡ Priority-Based View
```text
╔══════════════════════════════════════════════╗
║              HIGH PRIORITY TASKS             ║
╚══════════════════════════════════════════════╝
 1. 🔴 Complete Math Homework                 
    📅 Due: 2024-01-20 | 🎯 University Assign.
 2. 🔴 Prepare Java Presentation              
    📅 Due: 2024-01-18 | 🎯 University Assign.

```

### 📈 Dashboard Overview
```text
┌───────────────────────────────────────────────┐
│                 DASHBOARD                     │
└───────────────────────────────────────────────┘
 📊 Total Projects: 3                          
 📋 Total Tasks: 15                            
 ✅ Completed: 8 (53%)                         
 ⏳ Pending: 7                                 
 ⚡ Priority Breakdown:                        
   • 🔴 URGENT: 2 tasks                        
   • 🟡 HIGH: 3 tasks                          
   • 🟢 MEDIUM: 6 tasks                        
   • 🔵 LOW: 4 tasks                           
 📅 Upcoming Deadlines:                        
   • Tomorrow: Complete Math Homework          
   • In 3 days: Java Project Submission        

```

---

## 🎮 Usage Examples

### 🏗️ Creating a Project
```text
Enter project name: University Assignments
Enter project description: All university related tasks and assignments

✅ Project 'University Assignments' created successfully!
```

### ✨ Adding a New Task
```text
Select project: University Assignments
Enter task title: Complete Math Homework
Enter description: Solve calculus problems (Ch. 5–8)

Select task type:
1. Simple Task
2. Recurring Task
3. Project Task
Choice: 1

Select priority:
1. 🔵 LOW
2. 🟢 MEDIUM
3. 🟡 HIGH
4. 🔴 URGENT
Choice: 3

Enter due date (YYYY-MM-DD): 2024-01-20

✅ Task 'Complete Math Homework' added successfully!
```

### ✅ Marking as Complete
```text
Select task to mark complete:
1. Complete Math Homework [IN_PROGRESS]
2. Prepare Java Presentation [PENDING]
Choice: 1

🎉 Task 'Complete Math Homework' marked as COMPLETED!
```

---

## 🔍 Search & Filter Options
- Filter by **Priority** (`LOW`, `MEDIUM`, `HIGH`, `URGENT`)
- Filter by **Status** (`PENDING`, `IN_PROGRESS`, `COMPLETED`)
- Filter by **Project**
- Search by **Title** or **Description**
- View **Overdue**, **Today’s**, or **This Week’s** tasks

---

## 🧠 Key Functionalities

### 🗂️ Project Operations
- Create, view, edit, and delete projects  
- View project stats and details  

### 📝 Task Operations
- Add and manage different task types  
- Set priorities and due dates  
- Mark as complete or edit details  
- View tasks by project or filter options  

### 📊 Viewing Options
- Comprehensive dashboard overview  
- Priority-based lists  
- Project-specific task lists  
- Filtered views with emojis and colors  

---

## 💡 Implementation Notes
- All data stored **in-memory** (no file persistence)  
- Clean **object-oriented design**  
- User-friendly **terminal UI** with input validation  
- Color-coded priorities and statuses for clarity  

---

> 🧩 **Developer Note:** This project is ideal for learning OOP design principles, CLI UX, and Java-based architecture for productivity tools.
