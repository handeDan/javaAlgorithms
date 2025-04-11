package src;

import java.util.HashMap;
import java.util.Map;

public class RepeatingWords {
    public static void main(String[] args) {
        String software = "Software is the foundational element that drives the functionality and innovation of nearly every modern technology we rely on in our daily lives. It refers to a set of organized instructions or code written by developers to perform specific tasks or solve particular problems through a computing device. Unlike hardware, which consists of the tangible, physical parts of a computer system, software is intangible—it exists in the digital realm yet is responsible for enabling all operations, from the simplest to the most complex. There are several categories of software, each serving different purposes. System software, such as operating systems (like Windows, macOS, or Linux) and utilities, manages the hardware and creates an environment for other software to run. Application software is built for end users to perform tasks—such as web browsers, email clients, word processors, games, or financial systems—while development software provides the tools and platforms developers need to write, debug, test, and maintain code, including IDEs, compilers, and version control systems." +
                "Over time, the process of creating software has matured into a highly disciplined field, combining principles of computer science, engineering, and design. Software development methodologies like Agile, Scrum, and DevOps emphasize continuous integration, delivery, collaboration, and feedback loops, allowing teams to respond rapidly to user needs and evolving requirements. Programming languages—from low-level languages like C and Assembly to high-level languages like Java, Python, and JavaScript—allow developers to express logic in human-readable code that can be translated into machine instructions. Software is also increasingly reliant on frameworks, libraries, and APIs to accelerate development and enable interoperability among systems." +
                "In a world that is becoming more interconnected and data-driven by the day, software plays an integral role in nearly every sector. In healthcare, it enables life-saving diagnostics, telemedicine, and patient record management. In finance, it powers everything from mobile banking apps to high-frequency trading algorithms. In education, software platforms facilitate e-learning, virtual classrooms, and personalized education experiences. In entertainment, it is at the core of gaming engines, music streaming platforms, and film production tools. Beyond these industries, software also enables infrastructure, logistics, space exploration, climate modeling, and artificial intelligence" +
                "The importance of software goes beyond mere functionality—it influences how people interact, communicate, learn, and create. As artificial intelligence, machine learning, and cloud computing continue to advance, software is becoming even more dynamic, predictive, and adaptive. Developers are now building smart systems that can learn from data, automate tasks, and make decisions, paving the way for technologies such as autonomous vehicles, digital assistants, and advanced robotics. With cybersecurity threats on the rise, software also plays a defensive role, helping to protect data integrity, privacy, and system resilience." +
                "In essence, software is not just a tool—it is a dynamic, ever-evolving ecosystem that fuels innovation and progress in our modern world. It bridges the gap between human intent and machine capability, turning imagination into reality and shaping the digital landscape we navigate every day.";

        System.out.println(software);

        String[] words = software.split(" ");
        System.out.println(words);

        Map<String, Integer> wordFrequencyMap = new HashMap<>();

        for (String word : words) {
            String alteredWord = word.trim().toLowerCase(); //baştaki, sondaki boşlukları alınıp küçük harfe çevrildi

            wordFrequencyMap.put(alteredWord, wordFrequencyMap.getOrDefault(alteredWord, 0) + 1);
        }
        System.out.println(wordFrequencyMap);
    }

}
