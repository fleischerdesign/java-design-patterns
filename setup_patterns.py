import os

analogies = {
    "singleton-classic": "The unique office printer",
    "singleton-billpugh": "The unique office printer",
    "singleton-enum": "The unique office printer",
    "factory": "The Pizza Shop",
    "abstract-factory": "The Furniture Factory (Matching Sets)",
    "builder": "The Custom Burger Order",
    "prototype": "The Cell Division",
    "adapter": "The Travel Plug",
    "bridge": "The Remote Control and TVs",
    "decorator": "The Coffee Layers",
    "composite": "The File System (Files and Folders)",
    "facade": "The Home Theater System's 'Play' Button",
    "flyweight": "The Forest of Trees",
    "proxy": "The Credit Card (Cash Proxy)",
    "strategy": "Modes of Transport (Bus, Taxi, Bike)",
    "observer": "The News/YouTube Subscription",
    "chain-of-responsibility": "The Support Ticket Escalation",
    "command": "The Restaurant Order Slip",
    "iterator": "The TV Channel Surfer",
    "mediator": "The Air Traffic Controller",
    "memento": "The 'Save Game' or Undo Button",
    "state": "The Traffic Light",
    "template-method": "The Standard Baking Recipe",
    "visitor": "The Building Inspector"
}

pattern_descriptions = {
    "singleton-classic": "I implemented this classic Singleton to ensure a class has only one instance while providing a global point of access. It uses lazy initialization and synchronization to handle multi-threaded access safely.",
    "singleton-billpugh": "I used the Bill Pugh Singleton implementation here. It relies on an inner static helper class to achieve lazy loading and thread safety without explicit synchronization, which is more efficient.",
    "singleton-enum": "I chose the Enum Singleton approach because it is the most robust way to implement a singleton in Java. It provides built-in protection against serialization and reflection attacks.",
    "factory": "I created this Factory pattern to encapsulate object creation. Instead of calling 'new' directly, I use a factory method to produce different shapes based on input, keeping the client code clean.",
    "abstract-factory": "I implemented the Abstract Factory to produce families of related objects, like Windows or Mac UI components, without specifying their concrete classes. This ensures consistency across the application.",
    "builder": "I used the Builder pattern to construct complex objects step by step. It is especially helpful when an object has many optional parameters, making the creation process much more readable.",
    "prototype": "I implemented the Prototype pattern to create new objects by cloning an existing 'prototype' instance. This is useful when the cost of creating a new object from scratch is expensive or complex.",
    "adapter": "I created this Adapter to allow incompatible interfaces to work together. It acts like a travel plug, translating calls from a modern interface into a format that an older class can understand.",
    "bridge": "I used the Bridge pattern to decouple an abstraction from its implementation. This allows both to vary independently, which is great for avoiding an explosion of subclasses when adding new features.",
    "decorator": "I implemented the Decorator pattern to add new functionality to an object dynamically. Like adding layers to a coffee, I can wrap an object with multiple decorators to extend its behavior without changing its core.",
    "composite": "I chose the Composite pattern to treat individual objects and groups of objects the same way. It is perfect for building tree structures like file systems where folders can contain both files and other folders.",
    "facade": "I created a Facade to provide a simple interface to a complex subsystem. It hides the messy details of multiple classes behind a single 'Play' button, making the system much easier to use.",
    "flyweight": "I implemented the Flyweight pattern to save memory by sharing as much data as possible between similar objects. In a forest of thousands of trees, we only store the shared 'type' data once.",
    "proxy": "I used the Proxy pattern to provide a placeholder for another object. It allows me to control access, perform lazy loading, or add security checks before passing the call to the real object.",
    "strategy": "I implemented the Strategy pattern to switch between different algorithms at runtime. It allows me to choose the best transport mode based on the current situation without hardcoding the logic.",
    "observer": "I created this Observer pattern to establish a one-to-many relationship. When the state of one object changes, all its subscribers are automatically notified and updated, just like a news feed.",
    "chain-of-responsibility": "I used the Chain of Responsibility to pass a request along a chain of potential handlers. Each handler decides whether to process the request or pass it to the next person in line.",
    "command": "I implemented the Command pattern to encapsulate a request as an independent object. This allows me to queue requests, log them, or even support undo operations by treating actions as data.",
    "iterator": "I created an Iterator to provide a standard way to go through elements of a collection without exposing its internal structure. It is like a TV remote that lets you flip through channels sequentially.",
    "mediator": "I used the Mediator pattern to centralize communication between objects. Instead of objects talking directly to each other and creating a mess, they all communicate through a single central hub.",
    "memento": "I implemented the Memento pattern to capture and restore an object's internal state. This is essential for features like 'Undo' or 'Save Game' where you need to roll back to a previous point in time.",
    "state": "I used the State pattern to allow an object to change its behavior when its internal state changes. The object will appear to change its class, much like a traffic light switching its rules based on the color.",
    "template-method": "I created a Template Method to define the skeleton of an algorithm in a base class while letting subclasses override specific steps. It ensures the overall process remains consistent while allowing flexibility.",
    "visitor": "I implemented the Visitor pattern to add new operations to a group of classes without modifying them. A visitor 'visits' each element and performs a specific task, keeping the logic separated from the data."
}

def get_fiae_why(pattern_type):
    if pattern_type in ["singleton-classic", "singleton-billpugh", "singleton-enum", "factory", "abstract-factory", "builder", "prototype"]:
        return "As FIAE students, mastering creational patterns is vital for writing professional Java code. It helps us manage object lifecycles efficiently and prepares us for using modern frameworks like Spring, which rely heavily on these concepts for dependency injection."
    if pattern_type in ["adapter", "bridge", "decorator", "composite", "facade", "flyweight", "proxy"]:
        return "For us as FIAE students, structural patterns are key to managing code complexity. They teach us how to build flexible systems that can easily integrate with existing libraries or legacy code, a common task in our future professional careers."
    return "Understanding behavioral patterns is essential for FIAE students because they focus on how objects communicate. Mastering these patterns allows us to write decoupled, testable, and maintainable code, which is a core requirement for any high-quality software project."

def get_what(filename, pattern_name):
    name = filename.split('.')[0]
    if name == "Main":
        return f"This is the entry point of the project. I use it to demonstrate how the {pattern_name} pattern works in a real scenario."
    if "Factory" in name:
        return "This class is responsible for creating objects. It encapsulates the instantiation logic so the client doesn't need to know the details."
    if "Strategy" in name or name in ["RoadStrategy", "PublicTransportStrategy", "WalkingStrategy"]:
        return "This class defines a specific strategy or algorithm that can be swapped out at runtime."
    if "Observer" in name or "Subject" in name:
        return "This part of the pattern handles the notification system, ensuring that all interested parties stay updated when changes occur."
    if "Command" in name:
        return "This class represents a specific action that has been encapsulated into an object."
    if "Decorator" in name:
        return "This is a decorator class that adds extra functionality to our base object without changing its original structure."
    if "State" in name:
        return "This class represents a specific state of the system and defines how the system behaves when it is in this state."
    if "Config" in name:
        return "This class manages application settings and ensures we have a consistent configuration throughout the app."
    return f"This class plays a role in the {pattern_name} pattern, helping to structure our code according to the pattern's principles."

def process_directory(dir_name):
    full_path = os.path.join("/home/philipp/dev/java-design-patterns", dir_name)
    if not os.path.exists(full_path):
        return

    # Create README.md
    readme_content = f"""# {dir_name.replace('-', ' ').title()} Pattern

{pattern_descriptions[dir_name]}

### Analogy: {analogies[dir_name]}
I like to think of this pattern as {analogies[dir_name].lower()}. It helps explain the concept in simple terms that are easy to remember for our exams and daily work.

### Why this is useful for FIAE students
{get_fiae_why(dir_name)}
"""
    # Replace em-dashes and double hyphens in the description (just in case)
    readme_content = readme_content.replace("\u2014", ", ").replace("--", ", ")
    
    with open(os.path.join(full_path, "README.md"), "w") as f:
        f.write(readme_content)

    # Process .java files
    for root, dirs, files in os.walk(full_path):
        for file in files:
            if file.endswith(".java"):
                file_path = os.path.join(root, file)
                with open(file_path, "r") as f:
                    content = f.read()
                
                # Prepare comments
                what = get_what(file, dir_name.replace('-', ' ').title())
                why = get_fiae_why(dir_name)
                
                comment = f"/**\n * WHAT: {what}\n * \n * WHY: {why}\n */\n"
                
                # Check if it already has the comment (safety)
                if "WHAT: " not in content:
                    # Insert after package declaration if exists
                    if "package " in content:
                        lines = content.split('\n')
                        inserted = False
                        for i, line in enumerate(lines):
                            if line.strip().startswith("package "):
                                lines.insert(i + 1, "\n" + comment)
                                inserted = True
                                break
                        if not inserted:
                            lines.insert(0, comment + "\n")
                        new_content = '\n'.join(lines)
                    else:
                        new_content = comment + "\n" + content
                    
                    with open(file_path, "w") as f:
                        f.write(new_content)

if __name__ == "__main__":
    for dir_name in analogies.keys():
        process_directory(dir_name)
